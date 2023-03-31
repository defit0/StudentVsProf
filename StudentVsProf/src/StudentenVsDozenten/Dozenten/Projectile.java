package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.attackType;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.Timer.TimerAction;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class Projectile implements TimerAction, Visible{
	public URL imagePath = getClass().getResource("Bullet.png");
	public MapObject mapObject;
	Dozent Doz;
	attackType attackType;
	Position Pos;
	Field F;
	int damage;
	int EfecktLength;
	int intensity;
	float speet;
	float length = 30f;
	float height = 30f;
	boolean generiert = false;
	float gap = 30f;
	
	public Projectile(Dozent d) {
		PlayingField.gameTimer.add(this);
		Doz = d;
		attackType = d.getAttackType();
		Pos = new Position(d.Pos.getxPosition()+gap*2,d.Pos.getyPosition()+gap,length, height);
		createMapObject();
		F = d.getMyField();
		damage = d.getDamage();
		EfecktLength = d.getLength();
		intensity = d.getIntensity();
		speet = d.getSpeet();
		
		System.out.println("neue Bulet");
		generiert = true;
	}
	
	void flay(){
		F.subProjectile(this);
		Position tempPos = Pos.addX(speet);
		System.out.println(tempPos);
		if(Math.round(tempPos.getxPosition())>= (PlayingField.Edgex -1)* PlayingField.fieldSize) {
			//System.out.println(">>"+((PlayingField.Edgex )* PlayingField.fieldSize)+"/"+tempPos.getxPosition());
			removMe();//auserhalb das Spielfelds
			return;
		}
		Pos = tempPos;
		F = F.getS().isIn(Pos);	
		F.addProjectile(this);
		if (CheckAndHit()) {
			removMe();
		};
		updateMapObject();
	}
	Student Checkhits() {
		if(F.getStudenten().isEmpty())
			return null;
		for(Student s : F.getStudenten()) {
			System.out.println("es könnte klappen");
			if(Position.Colied(Pos, s.getPos())) {
				System.out.println("hit");
				return s;
			}
		}
		return null;
	}
	
	boolean CheckAndHit(){
		Student S =Checkhits();
		if(S != null) {
			S.gethit(damage, attackType, intensity, EfecktLength);
			return true;
		}
		return false;
	}
	void removMe() {
		System.out.println("remov");
		F.subProjectile(this);
		PlayingField.gameTimer.remove(this);
		mapObject.remove();
		//mapObject = null;
		SetupGame.spielfeld.repaint();
	}

	@Override
	public void TimerActionPerform() {
		if(!generiert)
			return;
		flay();
//		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Projectile [Pos="  +Pos.getxPosition()+ "/" +Pos.getyPosition() + "]";
	}

	@Override
	public void createMapObject() {
		mapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld, this);
		
	}

	@Override
	public void updateMapObject() {
		if(!generiert)
			return;
		if(!Pos.equals(mapObject.getPosition())) {
			mapObject.setObjectPosition(Pos);
		}
		
	}

	@Override
	public void getClicked() {
		// TODO Auto-generated method stub
		
	}
	
}
