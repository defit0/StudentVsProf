package StudentenVsDozenten.Studenten.DefenseType;

import StudentenVsDozenten.Dozenten.AttackTypen.attackType;
import StudentenVsDozenten.Effekte.Effect;

public class standart implements DefenseType{

	@Override
	public Effect getHit(int damage, attackType at,int length,int intensity) {
		return at.attacPattern(this,damage, length, intensity);
	}

}
