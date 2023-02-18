package Dozenten;

import Student.Genie;
import Student.deaf;
import Student.standart;
import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SingleDamage;

public class talk implements attackType{

	@Override
	public Effect attacPattern(deaf dt, int damage,int length,int intensity) {
		return new SingleDamage((int) Math.round(damage * 0.5));
	}

	@Override
	public Effect attacPattern(Genie dt, int damage,int length,int intensity) {
		return new SingleDamage(damage);
	}

	@Override
	public Effect attacPattern(standart dt, int damage,int length,int intensity) {
		return new SingleDamage(damage);
	}
	
}
