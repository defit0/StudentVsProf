package StudentenVsDozenten.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datenbank {

	/*
	 * lokale Datenbankverbindung static String url =
	 * "jdbc:mysql://localhost:3306/hvsdatabase"; static String user = "root";
	 * static String pass = "";
	 */
	// öffentliche DB-Verbindung
	static String url = "jdbc:mysql://cp40.sp-server.net:3306/leondie1_hochschule";
	static String user = "leondie1_hochschule_user";
	static String pass = "m*tjgK7H9n*W";
	String playerdb;
	String pwdb;
	String salt;
	

	public String[] getAllLevel() {

		String[] Level = new String[6];

		try {
			Connection db = DriverManager.getConnection(url, user, pass);
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT lvlid,titel FROM level");

			while (rs.next()) {
				Level[Integer.parseInt(rs.getString(1))] = rs.getString(2);
			}
			/*
			 * Konsolenausgabe der Level for (int counter = 1; counter < Level.length;
			 * counter++) { System.out.println(Level[counter]); }
			 */

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return Level;

	}

	public int getLevelfreigeschaltet() {

		int level = 0;
		try {
			Connection db = DriverManager.getConnection(url, user, pass);
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT lvlid FROM levelfreigeschaltet WHERE name = '" + Client.player
					+ "' AND boolgeschafft = false");

			while (rs.next()) {
				level = Integer.parseInt(rs.getString(1));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return level;

	}

	public void unlockNextLevel(int level) {
		
		try {
			Connection db = DriverManager.getConnection(url, user, pass);
			Statement statement = db.createStatement(); // wichtig für INSERT
			
				
			
			if (level < 6) {
				statement.executeUpdate("UPDATE levelfreigeschaltet SET boolgeschafft = TRUE WHERE name = '"
						+ Client.player + "' AND boolgeschafft = false AND lvlid =" + level);
				statement.executeUpdate("INSERT INTO levelfreigeschaltet(name,lvlid,boolgeschafft) VALUES ('"
						+ Client.player + "'," + ++level + ", false)");
			} 
			else {
				
				System.out.println("Alle Level geschafft");
			}
			
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public boolean login(String player, String pw) {

		try {

			Connection db = DriverManager.getConnection(url, user, pass);
			//System.out.println("Verbindung erfolgreich hergestellt");
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM benutzer WHERE name = '" + player + "'");
			while (rs.next()) {
				//System.out.println(rs.getString(1) + " " + rs.getString(2));
				playerdb = rs.getString(1);
				pwdb = rs.getString(2);
			}
			if (pwdb == null || playerdb == null) {
				System.out.println("Falscher Benutzername.");
				return false;
			}
			salt = "$2a$" + pwdb.substring(4);

			pw = BCrypt.hashpw(pw, salt);
			pw = pw.substring(0, pw.length() - 10);
			pw = "$2y$" + pw.substring(4);
			// System.out.println("pwdb: " + pwdb);
			// System.out.println("pw : " + pw);

			if (pw.equals(pwdb)) {

				System.out.println("angemeldet");
				return true;

			} else {
				System.out.println("Falsches Passwort.");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;

	}

	// dbconnect Vorlage für weitere Abfragen
	public void dbconnect() {

		try {
			Connection db = DriverManager.getConnection(url, user, pass);
			//System.out.println("Verbindung erfolgreich hergestellt");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void insertScore(String name, String date, int score) {

		try {
			Connection db = DriverManager.getConnection(url, user, pass);
			Statement statement = db.createStatement(); // wichtig für INSERT
			statement.executeUpdate("REPLACE INTO highscoreliste (name,datum,score) VALUES ('" + name + "','" + date
					+ "'," + score + ");");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
