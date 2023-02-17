package Dozenten;


import Student.Effect;
import Student.Genie;
import Student.deaf;
import Student.standart;

public interface attackType {
	
	
	Effect attacPattern(deaf dt,int damage);
	Effect attacPattern(Genie dt,int damage);
	Effect attacPattern(standart dt, int damage);

	

}
