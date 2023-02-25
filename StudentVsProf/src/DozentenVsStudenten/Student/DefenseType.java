package DozentenVsStudenten.Student;
import DozentenVsStudenten.Dozenten.attackType;
import StudentenVsDozenten.Effekte.Effect;

public interface DefenseType {

	public Effect getHit(int damage, attackType at,int length,int intensity);
	
	
	
	
	
}
