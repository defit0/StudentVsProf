package DozentenVsStudenten.Student;

import DozentenVsStudenten.Dozenten.attackType;
import StudentenVsDozenten.Effekte.Effect;

public class deaf implements DefenseType{

	@Override
	public Effect getHit(int damage, attackType at,int length,int intensity) {
		return at.attacPattern(this,damage, length, intensity);
		
	}

}
