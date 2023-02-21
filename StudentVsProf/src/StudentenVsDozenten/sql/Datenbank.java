package StudentenVsDozenten.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datenbank {

	/*
	 lokale Datenbankverbindung
	static String url = "jdbc:mysql://localhost:3306/hvsdatabase"; 
	static String user = "root";
	static String pass = "";
	*/
	//öffentliche DB-Verbindung
	static String url = "jdbc:mysql://cp40.sp-server.net:3306/leondie1_hochschule";
	static String user = "leondie1_hochschule_user";
	static String pass = "m*tjgK7H9n*W";
	String playerdb;
	String pwdb;
	String salt;

	public void login(String player, String pw) {

		try {

			Connection db = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt");
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM benutzer WHERE name = '" + player + "'");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
				playerdb = rs.getString(1);
				pwdb = rs.getString(2);
			}
			if (pwdb == null || playerdb == null) {
				System.out.println("Falscher Benutzername.");
				return;
			} 
				salt = "$2a$" + pwdb.substring(4);

				pw = BCrypt.hashpw(pw, salt);
				pw = pw.substring(0, pw.length() - 10);
				pw = "$2y$" + pw.substring(4);
				System.out.println("pwdb: " + pwdb);
				System.out.println("pw  : " + pw);

				if (pw.equals(pwdb)) {

					System.out.println("angemeldet");

				} else {
					System.out.println("Falsches Passwort.");
				}

			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void dbconnect() {

		try {
			Connection db = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void insertScore(String name, String date, int score) {

		try {
			Connection db = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt, score wurde eingetragen.");
			Statement statement = db.createStatement(); // wichtig für INSERT
			// Statement stm = con.createStatement();
			// ResultSet rs = stm.executeQuery("SELECT score FROM `highscoreliste` WHERE
			// name ='" + name + "'");
			statement.executeUpdate("REPLACE INTO highscoreliste (name,datum,score) VALUES ('" + name + "','" + date
					+ "'," + score + ");");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
