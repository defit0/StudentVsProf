package StudentenVsDozenten.Student;

import java.net.URL;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Timer.TimerAction;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class StudentenSetzen implements TimerAction {
	int anzStudenten = 20;
	
	public StudentenSetzen() {
		PlayingField.studentenSpawner.add(this);
	}

	public void setStudent() {
		PlayingField.gameTimer.add(new Student(PlayingField.GameMap.getFieldIn(700, (int) zufallsPos())));

	}
	
	
	public float zufallsPos() {
		float pos;		
		pos = (float) Math.random()*500;
		return pos;
	}

	@Override
	public void TimerActionPerform() {
		setStudent();
		anzStudenten--;
		if(anzStudenten <= 0) {
			//StudentenSetzen s = new StudentenSetzen();
			PlayingField.studentenSpawner.remove(this);
		}
	}  

}
