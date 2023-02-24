package StudentenVsDozenten.sql;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Client {

	
	static Scanner s = new Scanner(System.in);
	static Datenbank db = new Datenbank();
	static String player;
	static String pw;
	static int score;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start();
		//endOfGame();
		//db.getLevelfreigeschaltet();
		player = "Tester";
		db.unlockNextLevel(db.getLevelfreigeschaltet());
	}
	
		
	public static void start() {
		
		System.out.println("Benutzer:");
		player = s.next();
		System.out.println("Passwort:");
		pw = s.next();
		db.login(player,pw);
		
	}


	public static void endOfGame() {

		player = "Markus";
		score = 89;
		db.insertScore(player, getDate(), score);

	}

	public static String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");// "yyyy.MM.dd - HH:mm:ss" für h,min,s
		Date currentTime = new Date();
		return (formatter.format(currentTime));
	}
}