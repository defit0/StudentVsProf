package StudentenVsDozenten;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Map.Map;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Map.Printer;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.Timer.GameTimer;

public class Start {

	public static void main(String[] args) {
		
		PlayingField pf = new PlayingField();
		Printer p = new Printer();
		Dozent Euler = new Dozent(PlayingField.GameMap.getFieldIn(0, 3));
		Student Tom = new Student(7.9f,3);
		PlayingField.gameTimer.add(Tom);
		PlayingField.gameTimer.add(p);
		PlayingField.gameTimer.start();
		PlayingField.allePerceptualBehaviour.start();
		

	}

}
