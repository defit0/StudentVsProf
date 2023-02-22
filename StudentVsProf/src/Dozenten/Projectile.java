package Dozenten;

import DozentenVsStudenten.Map.Field;
import DozentenVsStudenten.Map.PlayingField;
import Student.Student;
import StudentenVsDozenten.Hilfsklasse.Position;
import Timer.TimerAction;

public class Projectile implements TimerAction{
	Dozent Doz;
	attackType attackType;
	Position Pos;
	Field F;
	int damage;
	int EfecktLength;
	int intensity;
	float speet;
	float length = 0.4f;
	
	public Projectile(Dozent d) {
		PlayingField.gameTimer.add(this);
		Doz = d;
		attackType = d.getAttackType();
		Pos = new Position(d.Pos.getxPosition(),d.Pos.getyPosition(),length);
		F = d.getMyField();
		damage = d.getDamage();
		EfecktLength = d.getLength();
		intensity = d.getIntensity();
		speet = d.getSpeet();
		
	}
	
	void flay(){
		F.subProjectile(this);
		Position tempPos = Pos.addX(speet);
		System.out.print(tempPos);
		if(Math.round(tempPos.getxPosition())>= PlayingField.EdgeY ) {
			removMe();//auserhalb das Spielfelds
			return;
		}
		Pos = tempPos;
		F = F.getS().isIn(Pos);	
		F.addProjectile(this);
		if (CheckAndHit()) {
			removMe();
		};
	}
	Student Checkhits() {
		if(F.getStudenten().isEmpty())
			return null;
		for(Student s : F.getStudenten()) {
			if(Position.ColiedVerifier(Pos, s.getPos())) {
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
		System.out.print(Pos);
		F.subProjectile(this);
		PlayingField.gameTimer.remov(this);
	}

	@Override
	public void TimerActionPerform() {
		flay();
//		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Projectile [Pos="  +Pos.getxPosition()+ "/" +Pos.getyPosition() + "]";
	}
	
}
