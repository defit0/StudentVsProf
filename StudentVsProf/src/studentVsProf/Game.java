package studentVsProf;

public class Game {

	static Prof prof;
	static Student student;
	static double boardsize = 8.5; // Bei Plants vs Zombies gibt es bei der x Achse 9 Felder und bei der y Achse 6
									// Felder

	public static void main(String[] args) {
		setProf(0.0); //Hier kann man seine Professoren einsetzen
		run();
	}

	public static void setProf(double getPos) {

		prof.posXY = getPos;
	}

	public static void run() {
		statistics();
		while (gameRunning() == true) {
			prof.shoot(null);
			if (gameRunning() == true) {
			student.move(1);
			}
		}
	}

	public static boolean gameRunning() {

		if (student.posXY >= 0 && student.HP > 0 && prof.HP > 0) {
			// System.out.println("Spiel läuft");
			return true;
		}
		System.out.println("Spiel beendet");
		return false;
	}
	
	
	public static void statistics() {
		System.out.println("Es gibt einen Professor mit "+prof.HP+ " Leben auf der Position "+ prof.posXY+"!");
		sleep(1000);
		System.out.println("Es gibt einen Studenten mit "+student.HP+ " Leben auf der Position "+ student.posXY+"!");
		sleep(1000);
		System.out.println("A huge wave is coming!");
		sleep(2000);
	}
	
	public static void sleep(int sleep) {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
		}
	}

}
