package StudentenVsDozenten.Studenten.DefenseType;
import StudentenVsDozenten.Dozenten.AttackTypen.attackType;
import StudentenVsDozenten.Effekte.Effect;

public interface DefenseType {

	public Effect getHit(int damage, attackType at,int length,float intensity);
	
	
	
	
	
}
