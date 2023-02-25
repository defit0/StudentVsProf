package DozentenVsStudenten.Dozenten;


import DozentenVsStudenten.Student.Genie;
import DozentenVsStudenten.Student.deaf;
import DozentenVsStudenten.Student.standart;
import StudentenVsDozenten.Effekte.Effect;

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
