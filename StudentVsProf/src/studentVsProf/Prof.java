package studentVsProf;

public class Prof {

	static int HP = 10; // HP = HealthPoints
	static int DMG = 1; // DMG = Damage
	static double posXY;

	public static int shoot(Student student) { // schieße Student sekündlich ab
		student.HP = student.HP - DMG;
		System.out.println("Student getroffen!");
		if (student.HP <= 0) {
			student = null;
			System.out.println("Student exmatrikuliert!");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		return student.HP;
	}

}
