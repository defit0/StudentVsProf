package StudentenVsDozenten.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datenbank {

	static String url = "jdbc:mysql://localhost:3306/hvsdatabase";
	static String user = "root";
	static String pass = "";
	String playerdb;
	String pwdb;
	String salt;

	public void login(String player, String pw) {

		try {
			BCrypt bcrypt = new BCrypt();
			Connection db = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt");
			Statement stm = db.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM benutzer WHERE name = '"+player+"'");
			while(rs.next()){
				System.out.println(rs.getString(1) + " " +rs.getString(2));
				playerdb = rs.getString(1);
				pwdb = rs.getString(2);
			}
			System.out.println("pw: "+ pw);
			System.out.println("pwdb: "+pwdb);
			salt = "$2a$";
			pw = bcrypt.hashpw(pw, salt);
			System.out.println("gehashtes pw"+pw);
			
			//bcrypt.checkpw(pw, pwdb);
			
			

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
			statement.executeUpdate("REPLACE INTO highscoreliste (name,datum,score) VALUES ('"+name+"','"+date+"',"+score+");");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
