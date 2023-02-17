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

	public void dbconnect() {

		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public boolean userAlreadyExists(String eingabe) {

		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt, SELECT wird gemacht.");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT name FROM benutzer WHERE name = '" + eingabe + "';");
			if (rs.next() == true) {
			} else {
				return false;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	public void insertUser(String spielername) {

		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt, INSERT wird gemacht.");
			Statement statement = con.createStatement(); // wichtig für INSERT
			statement.executeUpdate("INSERT INTO benutzer (name) VALUES ('" + spielername + "')");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void insertScore(String name, String date, int score) {

		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Verbindung erfolgreich hergestellt, INSERT wird gemacht.");
			Statement statement = con.createStatement(); // wichtig für INSERT
			//Statement stm = con.createStatement();
			//ResultSet rs = stm.executeQuery("SELECT score FROM `highscoreliste` WHERE name ='" + name + "'");
			statement.executeUpdate("REPLACE INTO highscoreliste (name,datum,score) VALUES ('" + name + "','" + date
						+ "'," + score + ");");
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}