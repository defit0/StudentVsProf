package StudentenVsDozenten.Map;

import java.util.ArrayList;

import StudentenVsDozenten.Dozenten.Wissenschaftsarbeiten;
import StudentenVsDozenten.Timer.GameTimer;
import StudentenVsDozenten.gui.SetupGame;

public class PlayingField {
	public static int fieldSize = 100;
	public static int wissenspunkte = 0;
	public static int Edgex = 8;
	public static int Edgey = 5;
	public static Map GameMap = new Map();
	public static GameTimer alleEfeckte = new GameTimer();
	public static GameTimer allePerceptualBehaviour = new GameTimer();
	public static GameTimer gameTimer = new GameTimer(10);
	public static GameTimer wissenstimer = new GameTimer(3000);
	public static ArrayList <Wissenschaftsarbeiten> Paper = new ArrayList<Wissenschaftsarbeiten>();

	public static int getWissenspunkte() {
		return wissenspunkte;
	}
	public static void setWissenspunkte(int wp) {
		wissenspunkte += wp;
		SetupGame.wissensCounter.setText("Wissenspunkte: " + String.valueOf(wissenspunkte));
	}
}