package StudentenVsDozenten.Map;

import java.util.ArrayList;

import StudentenVsDozenten.Dozenten.Wissenschaftsarbeiten;
import StudentenVsDozenten.Timer.GameTimer;

public class PlayingField {
	public static int fieldSize = 100;
	public static int wissenspunkte = 0;
	public static int Edgex = 8;
	public static int Edgey = 5;
	public static Map GameMap = new Map();
	public static GameTimer alleEfeckte = new GameTimer();
	public static GameTimer allePerceptualBehaviour = new GameTimer();
	public static GameTimer gameTimer = new GameTimer();
	public static GameTimer wissenstimer = new GameTimer(1000);
}
