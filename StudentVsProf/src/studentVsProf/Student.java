package studentVsProf;

public class Student {

	static int HP = 10; // HP = HealthPoints
	static int DMG = 1; // DMG = Damage
	static double posXY;
	static double speed;
	static Prof prof;

	public static double move(double posXY, double speed) {
		posXY++; // Student bewegt sich um ein Feld auf der xAchse nach vorne
		System.out.println("Student läuft!");
		return posXY;
	}

	public static int eat(Prof prof) { // wenn gefressen, delete Professor
		prof.HP = prof.HP - DMG;
		System.out.println("Prof angekaut!");
		if (prof.HP <= 0) {
			prof = null;
			System.out.println("Prof tot!");
		}
		return prof.HP;
	}

	public static void studentLoader() {

		// Hier sollen Studenten automatisch zufällig(auf der yAchse) auf dem Spielfeld
		// erscheinen. x = 0!
		// Nach Zeit kommen immer mehr Studenten

	}

}














