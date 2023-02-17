package Student;

import Dozenten.attackType;

public class standart implements DefenseType{

	@Override
	public Effect getHit(int damage, attackType at) {
		return at.attacPattern(this,damage);
	}

}
