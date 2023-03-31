package StudentenVsDozenten.sql;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {


    Datenbank db = new Datenbank();
    public static String player;
    public String pw;
    public static int score;


    public boolean start(String name, String password) {

        this.player = name;
        this.pw = password;

        if (db.login(player, pw) == true) {
            return true;
        } else {
            return false;
        }
    }

    public void endOfGame() {
        db.insertScore(player, getDate(), score);
    }

    public String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");// "yyyy.MM.dd - HH:mm:ss" für h,min,s
        Date currentTime = new Date();
        return (formatter.format(currentTime));
    }

    public static void addScore(int addedScore) {
        score += addedScore;
    }
}
