package studentVsProf;

public class Student {

	static int HP = 10; // HP = HealthPoints
	static int DMG = 1; // DMG = Damage
	static double posXY = 4.0;	//Standardmäßig müssen Studenten bei 8.0 starten!
	static double speed = 1;
	static Prof prof;
	static Game game;

	public static double move(double speed) {

		if (eatable(prof) == true) {
			System.out.println("Student und Prof kämpfen gegeneinander!");
			eat(prof);
		}
		else {
		posXY = posXY-speed; // Student bewegt sich um speed Feld auf der xAchse nach vorne
		System.out.println("Student läuft auf das Feld " + posXY + "!");
		game.sleep(1000);
		eatable(prof);
		}
		return posXY;

	}

	public static boolean eatable(Prof prof) {
		if (posXY == prof.posXY) {
			return true;
		}
		return false;
	}

	public static int eat(Prof prof) { // wenn gefressen, delete Professor

		prof.HP = prof.HP - DMG;
		game.sleep(1000);
		System.out.println("Student kaut Prof an, Prof hat noch "+ prof.HP +" Leben!");
		if (prof.HP <= 0) {
			prof = null;
			System.out.println("Prof tot!");
		}
		//System.out.println("Ich kann jetzt noch nicht essen!");
		return prof.HP;
	}

	public static void studentLoader() {

		// Hier sollen Studenten automatisch zufällig(auf der yAchse) auf dem Spielfeld
		// erscheinen. x = 0!
		// Nach Zeit kommen immer mehr Studenten

	}

}
