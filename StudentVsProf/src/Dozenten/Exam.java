package Dozenten;
import Student.Genie;
import Student.deaf;
import Student.standart;
import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SingleDamage;

public class Exam implements attackType{

	@Override
	public Effect attacPattern(deaf dt, int damage,int length,int intensity) {
		int criticel = 1;
		if(Math.random()<0.10) {
			criticel = 1000;
		}
		return new SingleDamage(damage*criticel);
	}

	@Override
	public Effect attacPattern(Genie dt, int damage,int length,int intensity) {
		int criticel = 1;
		if(Math.random()<0.10) {
			criticel = 2;
		}
		return new SingleDamage(damage*criticel);
	}

	@Override
	public Effect attacPattern(standart dt, int damage,int length,int intensity) {
		int criticel = 1;
		if(Math.random()<0.10) {
			criticel = 1000;
		}
		return new SingleDamage(damage*criticel);
	}
	

}
