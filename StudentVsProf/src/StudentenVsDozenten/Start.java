package StudentenVsDozenten;

import java.net.MalformedURLException;
import java.net.URL;

import StudentenVsDozenten.Dozenten.Forscher;
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

		SetupGame setupGame = new SetupGame();

		PlayingField pf = new PlayingField();
		Printer p = new Printer();
		//Dozent Euler = new Dozent(PlayingField.GameMap.getFieldIn(0, 3));
		Student Tom = new Student(PlayingField.GameMap.getFieldIn(700, 300));
		Tom.setPos(Tom.getPos().addY(90-Tom.getPos().getHeight()));
		Tom.updateMapObject();
		Forscher Wissenssammler = new Forscher(PlayingField.GameMap.getFieldIn(0, 400));
		PlayingField.gameTimer.add(Tom);
		PlayingField.gameTimer.add(p);
		PlayingField.gameTimer.start();
		PlayingField.allePerceptualBehaviour.start();
		PlayingField.wissenstimer.start();
	}
}