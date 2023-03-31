package StudentenVsDozenten;

import java.net.MalformedURLException;
import java.net.URL;

import StudentenVsDozenten.Auswahl.Team;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Map;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Map.Printer;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.Student.StudentenSetzen;
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
		//Student Tom = new Student(PlayingField.GameMap.getFieldIn(600, 300));
		//Tom.setPos(Tom.getPos().addX(PlayingField.fieldSize-90));
		//Tom.updateMapObject();
		//Forscher Wissenssammler1 = new Forscher(PlayingField.GameMap.getFieldIn(0, 400));
		//Forscher Wissenssammler2 = new Forscher(PlayingField.GameMap.getFieldIn(0, 0));
		//Forscher Wissenssammler3 = new Forscher(PlayingField.GameMap.getFieldIn(300, 100));
		//PlayingField.gameTimer.add(Tom);
		PlayingField.gameTimer.add(p);
		PlayingField.gameTimer.start();
		PlayingField.allePerceptualBehaviour.start();
		PlayingField.wissenstimer.start();
		PlayingField.alleEfeckte.start();
		PlayingField.studentenSpawner.start();
		Team TestTeam = new Team();
		StudentenSetzen TestStudenten = new StudentenSetzen();
		PlayingField.setWissenspunkte(6);
	}
}