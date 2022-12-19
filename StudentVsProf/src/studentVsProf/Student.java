package studentVsProf;

public class Student {

	static int HP = 0; // HP = HealthPoints
	static int DMG = 0; // DMG = Damage
	static double posXY;

	
	public void studentLoader() {		//Hier sollen Studenten automatisch zufällig auf dem Spielfeld erscheinen
		  
		
		
	}
	
	public double move(double posXY) {
		posXY++; // Student bewegt sich um ein Feld

		return posXY;
	}

	public void eat() {
		
	}

}
