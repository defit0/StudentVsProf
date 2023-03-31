package StudentenVsDozenten.Student;

import java.net.URL;
import java.util.ArrayList;



import StudentenVsDozenten.Dozenten.AttackTypen.attackType;
import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.Map;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Studenten.DefenseType.DefenseType;
import StudentenVsDozenten.Studenten.DefenseType.standart;
import StudentenVsDozenten.Timer.TimerAction;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class Student implements TimerAction, Visible {

	int attackspeed;
	float speed;
	int hitpoints;
	int damage;
	Position Pos;
	DefenseType dt;
	public URL imagePath = getClass().getResource("Standart_Student.png");
	public URL previousImagePath = null;
	public MapObject mapObject;
	public ArrayList<Effect> AllEffects= new ArrayList<Effect>();
	
	public Student(float x , int y) {
		this.attackspeed = 1;
		this.speed = 0.2f;
		this.hitpoints = 6;
		this.damage = 2;
		this.dt = new standart();
		this.Pos = new Position( x, y,100f, 100f);
		System.out.println("start:" + this);
		createMapObject();
	}
	
	public Student(Field fieldIn) {
		this.attackspeed = 1;
		this.speed = 0.2f;
		this.hitpoints = 6;
		this.damage = 2;
		this.dt = new standart();
		this.Pos = new Position( fieldIn.getPos().getxPosition(), fieldIn.getPos().getyPosition(),100f, 100f);
		System.out.println("start:" + this);
		createMapObject();
	}

	public void gethit(int damage,attackType at,int length,int intensity) {
		Effect e = dt.getHit(damage, at, length, intensity);
		imagePath = getClass().getResource("student_damaged.png");
		if (e != null) {
			AllEffects.add(e);
			e.influenceFirst(this);
		}
	}
	
	
	//alle Efecte in der Efectliste aktiveren sich
	void activateEffects() {
		if(AllEffects.size() == 0)
			return;
		ArrayList<Effect> AllTempEffects = new ArrayList<Effect>(AllEffects);
		for(Effect e : AllTempEffects) {
			e.influence(this);
		}
	}
	
	private void run() {
		Field F = PlayingField.GameMap.getFieldIn((int)Pos.getxPosition()+PlayingField.fieldSize, (int)Pos.getyPosition());
		F.removStudent(this);
		Pos = Pos.subX(speed);
		F = PlayingField.GameMap.getFieldIn((int)Pos.getxPosition(), (int)Pos.getyPosition());
		F.addStudent(this);
		
		
	}
	
	
	public void getDamage(int damage){
		hitpoints -= damage;
		if(hitpoints <= 0) {
			die();
		}
	}
	
	void die(){
		System.out.println("Ich bin jetzt tot");
		Field F = PlayingField.GameMap.getFieldIn((int)Pos.getxPosition()+PlayingField.fieldSize, (int)Pos.getyPosition());
		F.removStudent(this);
		PlayingField.gameTimer.remove(this);
		mapObject.remove();
		mapObject = null;
		Pos = new Position(0,0,0,0);
	}
	
	@Override
	public void TimerActionPerform() {
		activateEffects();
		run();
		updateMapObject();
		System.out.println(this);
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Student [attackspeed=" + attackspeed + ", speed=" + speed + ", hitpoints=" + hitpoints + ", damage="
				+ damage + ", dt=" + dt.getClass() + ", AllEffects=" + AllEffects + "Pos=" +Pos+"]";
	}

	
	public DefenseType getDt() {
		return dt;
	}

	public void setDt(DefenseType dt) {
		this.dt = dt;
	}

	public Position getPos() {
		return Pos;
	}

	public void setPos(Position pos) {
		Pos = pos;
	}


	@Override
	public void createMapObject() {
		mapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld, this);
	}

	@Override
	public void updateMapObject() {
		if (previousImagePath == imagePath ) {
		} else {
			mapObject.remove();
			mapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld, this);
			previousImagePath = imagePath;
//			if(imagePath != getClass().getResource("Standart_Student.png")) {
//				imagePath = getClass().getResource("Standart_Student.png");
//			}
		}
		if(!Pos.equals(mapObject.getPosition())) {
			mapObject.setObjectPosition(Pos);
		}
	}

	@Override
	public void getClicked() {

	}
}
