package Student;

import Dozenten.attackType;

public class deaf implements DefenseType{

	@Override
	public Effect getHit(int damage, attackType at) {
		return at.attacPattern(this,damage);
		
	}

}
