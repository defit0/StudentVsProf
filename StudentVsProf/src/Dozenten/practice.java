package Dozenten;

import Student.Genie;
import Student.deaf;
import Student.standart;
import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SlowDown;

public class practice implements attackType{

	@Override
	public Effect attacPattern(deaf dt, int damage, int length, int intensity) {
		return standard(damage, length, intensity);
	}

	@Override
	public Effect attacPattern(Genie dt, int damage, int length, int intensity) {
		return standard(damage, length, intensity);
	}

	@Override
	public Effect attacPattern(standart dt, int damage, int length, int intensity) {
		return standard(damage, length, intensity);
	}
	
	private Effect standard(int damage, int length, int intensity) {
		return new SlowDown(damage, length, intensity);
		
	}
}