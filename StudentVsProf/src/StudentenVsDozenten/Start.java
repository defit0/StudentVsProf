package StudentenVsDozenten;

import Dozenten.Dozent;
import DozentenVsStudenten.Map.Map;
import DozentenVsStudenten.Map.PlayingField;
import DozentenVsStudenten.Map.Printer;
import Student.Student;
import Timer.GameTimer;

public class Start {

	public static void main(String[] args) {
		
		PlayingField pf = new PlayingField();
		Printer p = new Printer();
		Dozent Euler = new Dozent(PlayingField.GameMap.getFieldIn(0, 3));
		Student Tom = new Student(7.9f,3);
		PlayingField.gameTimer.add(Euler);
		PlayingField.gameTimer.add(Tom);
		PlayingField.gameTimer.add(p);
		PlayingField.gameTimer.start();
		

	}

}
