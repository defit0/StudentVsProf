package Dozenten;
import Student.Genie;
import Student.SingleDamage;
import Student.deaf;
import Student.standart;
import StudentenVsDozenten.Effekte.Effect;

public class Exam implements attackType{

	@Override
	public Effect attacPattern(deaf dt, int damage) {
		int criticel = 1;
		if(Math.random()<0.10) {
			criticel = 1000;
		}
		return new SingleDamage(damage*criticel);
	}

	@Override
	public Effect attacPattern(Genie dt, int damage) {
		int criticel = 1;
		if(Math.random()<0.10) {
			criticel = 2;
		}
		return new SingleDamage(damage*criticel);
	}

	@Override
	public Effect attacPattern(standart dt, int damage) {
		int criticel = 1;
		if(Math.random()<0.10) {
			criticel = 1000;
		}
		return new SingleDamage(damage*criticel);
	}
	

}
