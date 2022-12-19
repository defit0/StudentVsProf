package studentVsProf;

public class Prof {

	static int HP = 5; // HP = HealthPoints
	static int DMG = 2; // DMG = Damage
	static double posXY;
	static Game game;
	
	public static int shoot(Student student) { // schieße Student sekündlich ab
		student.HP = student.HP - DMG;
		game.sleep(700);
		System.out.println("Ein Prof hat einen Student abgeschossen! Dieser Student hat noch "+ student.HP+" Leben!");
		if (student.HP <= 0) {
			student = null;
			System.out.println("Student exmatrikuliert!");
		}
		game.sleep(1000);
		return student.HP;
	}

}
