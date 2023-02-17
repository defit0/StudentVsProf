package StudentenVsDozenten.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client {

	static Scanner s = new Scanner(System.in);
	static Datenbank db = new Datenbank();
	static String player;
	static int score;

	public static void main(String[] args) {

		createUser();
		endOfGame();

	}

	public static void createUser() {

		System.out.println("Was soll dein Spielername sein?");
		String eingabe = s.next();

		if (db.userAlreadyExists(eingabe) == true) {
			createUser();
		} else {
			db.insertUser(eingabe);
		}
		player = eingabe;
	}

	public static void endOfGame() {

		//player = "Sebastian";
		score = -45;
		db.insertScore(player, getDate(), score);

	}

	public static String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");// "yyyy.MM.dd - HH:mm:ss" für h,min,s
		Date currentTime = new Date();
		return (formatter.format(currentTime));
	}
}
