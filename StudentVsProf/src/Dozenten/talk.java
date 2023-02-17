package Dozenten;

import Student.Effect;
import Student.Genie;
import Student.SingleDamage;
import Student.deaf;
import Student.standart;

public class talk implements attackType{

	@Override
	public Effect attacPattern(deaf dt, int damage) {
		return new SingleDamage((int) Math.round(damage * 0.5));
	}

	@Override
	public Effect attacPattern(Genie dt, int damage) {
		return new SingleDamage(damage);
	}

	@Override
	public Effect attacPattern(standart dt, int damage) {
		return new SingleDamage(damage);
	}
	
}
