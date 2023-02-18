package Student;

import Dozenten.attackType;
import StudentenVsDozenten.Effekte.Effect;

public class standart implements DefenseType{

	@Override
	public Effect getHit(int damage, attackType at) {
		return at.attacPattern(this,damage);
	}

}
