package StudentenVsDozenten;

import java.net.MalformedURLException;
import java.net.URL;

import StudentenVsDozenten.Auswahl.Team;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.TestDozent;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Map;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Map.Printer;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.gui.ContainerPanel;
import StudentenVsDozenten.gui.GameFrame;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;

public class Start {

	public static void main(String[] args) {

		System.gc();
		
		SetupGame setupGame = new SetupGame();

		PlayingField pf = new PlayingField();
		Printer p = new Printer();
		//Dozent Euler = new Dozent(PlayingField.GameMap.getFieldIn(0, 3));
		Student Tom = new Student(PlayingField.GameMap.getFieldIn(700, 300));
		Tom.updateMapObject();
		//Forscher Wissenssammler1 = new Forscher(PlayingField.GameMap.getFieldIn(0, 400));
		//Forscher Wissenssammler2 = new Forscher(PlayingField.GameMap.getFieldIn(0, 0));
		//Forscher Wissenssammler3 = new Forscher(PlayingField.GameMap.getFieldIn(300, 100));
		PlayingField.gameTimer.add(Tom);
		PlayingField.gameTimer.add(p);
		PlayingField.gameTimer.start();
		PlayingField.allePerceptualBehaviour.start();
		PlayingField.wissenstimer.start();
		//MapObject Debug = new MapObject("C:\\Users\\marku\\OneDrive\\Desktop\\MIB14 Softwareentwicklungsprojekt\\blanck.png", new Position(100, 100, PlayingField.Edgex*10, PlayingField.Edgey*10), SetupGame.spielfeld);
		Team TestTeam = new Team();
	}
}