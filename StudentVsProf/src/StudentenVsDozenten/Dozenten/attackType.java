package StudentenVsDozenten.Dozenten;


import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Student.Genie;
import StudentenVsDozenten.Student.deaf;
import StudentenVsDozenten.Student.standart;

public abstract class attackType {
	
	
	public Effect attacPattern(deaf dt,int damage,int length,int intensity) {
		return standard(damage,length,intensity);
	}
	public Effect attacPattern(Genie dt,int damage,int length,int intensity) {
		return standard(damage,length,intensity);
	}
	public Effect attacPattern(standart dt, int damage,int length,int intensity) {
		return standard(damage,length,intensity);
	}
	
	abstract protected Effect standard( int damage,int length,int intensity) ;

	

}
