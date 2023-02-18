package StudentenVsDozenten;

import Dozenten.attackType;
import Dozenten.practice;
import Dozenten.talk;
import Student.Student;
import Student.deaf;
import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SingleDamage;
import Timer.GameTimer;

public class Start {

	public static void main(String[] args) {
		GameTimer gt = new GameTimer();
		Student Peter = new Student();
		gt.add(Peter);
		Peter.setDt(new deaf());
		attackType AT = new practice();
		Peter.gethit(5, AT,5,2);
		gt.start();

	}

}
