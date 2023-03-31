package StudentenVsDozenten.Map;

import java.util.ArrayList;

import StudentenVsDozenten.Dozenten.Wissenschaftsarbeiten;
import StudentenVsDozenten.Timer.GameTimer;
import StudentenVsDozenten.gui.SetupGame;

public class PlayingField {
	public static int punktzahl;
	public static int fieldSize = 100;
	public static int wissenspunkte = 10;
	public static int Edgex = 8;
	public static int Edgey = 5;
	public static Map GameMap;
	public static GameTimer alleEfeckte;
	public static GameTimer allePerceptualBehaviour;
	public static GameTimer gameTimer;
	public static GameTimer wissenstimer;
	public static GameTimer studentenSpawner;
	public static ArrayList <Wissenschaftsarbeiten> Paper;
	//anschauen:
	GameTimer allePerceptualBehaviourTEST = allePerceptualBehaviour;
	
	public PlayingField() {
		//setupp
		GameMap = new Map();
		alleEfeckte = new GameTimer();
		allePerceptualBehaviour = new GameTimer(500);
		gameTimer = new GameTimer(10);
		wissenstimer = new GameTimer(2000);
		studentenSpawner = new GameTimer(7000);
		Paper = new ArrayList<Wissenschaftsarbeiten>();
		
		
		gameTimer.start();
		allePerceptualBehaviour.start();
		wissenstimer.start();
		alleEfeckte.start();
		studentenSpawner.start();
	}

	public static int getWissenspunkte() {
		return wissenspunkte;
	}
	public static void addWissenspunkte(int wp) {
		wissenspunkte += wp;
		SetupGame.wissensCounter.setText("Wissenspunkte: " + String.valueOf(wissenspunkte));
	}
	public static void setWissenspunkte(int wp) {
		wissenspunkte = wp;
		SetupGame.wissensCounter.setText("Wissenspunkte: " + String.valueOf(wissenspunkte));
	}
	
}