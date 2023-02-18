package Dozenten;


import Student.Genie;
import Student.deaf;
import Student.standart;
import StudentenVsDozenten.Effekte.Effect;

public interface attackType {
	
	
	Effect attacPattern(deaf dt,int damage,int length,int intensity);
	Effect attacPattern(Genie dt,int damage,int length,int intensity);
	Effect attacPattern(standart dt, int damage,int length,int intensity);

	

}
