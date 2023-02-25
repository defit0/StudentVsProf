package DozentenVsStudenten.Dozenten;

import DozentenVsStudenten.Student.deaf;
import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SingleDamage;

public class talk extends attackType{

	@Override
	public Effect attacPattern(deaf dt, int damage,int length,int intensity) {
		return new SingleDamage((int) Math.round(damage * 0.5));
	}

	@Override
	protected Effect standard(int damage, int length, int intensity) {
		return new SingleDamage(damage);
	}
	
}
