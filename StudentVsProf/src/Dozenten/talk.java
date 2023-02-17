package Dozenten;


import Student.Effect;
import Student.SingleDamage;
import Student.deaf;

public class talk implements attackType{

	@Override
	public Effect attacPattern(deaf dt, int damage) {
		return new SingleDamage(damage);
	}}
