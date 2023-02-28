package StudentenVsDozenten.Dozenten;


import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SlowDown;

public class practice extends attackType{
	
	protected Effect standard(int damage, int length, int intensity) {
		return new SlowDown(damage, length, intensity);
		
	}
}