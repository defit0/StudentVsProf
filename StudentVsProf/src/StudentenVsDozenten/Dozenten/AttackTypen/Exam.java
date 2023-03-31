package StudentenVsDozenten.Dozenten.AttackTypen;
import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SingleDamage;
import StudentenVsDozenten.Studenten.DefenseType.Genie;

public class Exam extends attackType{

	@Override
	public Effect attacPattern(Genie dt, int damage,int length,float intensity) {
		int critical = 1;
		if(Math.random()<0.10) {
			critical = 2;
		}
		return new SingleDamage(damage*critical);
	}

	
	
	@Override
	protected Effect standard( int damage,int length,float intensity) {
		int critical = 1;
		if(Math.random()<0.10) {
			critical = 1000;
		}
		return new SingleDamage(damage*critical);
	}
	

}
