package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Dozenten.AttackTypen.attackType;
import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.inLineTwo;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.inTrippelLineInfinete;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Timer.TimerAction;

public abstract class Dozent {

	int attackspeed;
	int thempAttackspeed;
	int hitpoints;
	Position Pos;
	Field myField;
	attackType attackType;
	perceptualBehaviour percBehav;
	//f�r die Projektiele
	int damage;
	int length;
	int intensity;
	float BulletSpeet;
/*	
	public Dozent(Field F){
		attackspeed = 5;
		thempAttackspeed = attackspeed;
		hitpoints = 6;
		myField = F;
		Pos = F.getPos();
		percBehav = new InLineInfinite(this);
		attackType = new talk();
		damage = 2;
		length = 0;
		intensity = 0;
		BulletSpeet = 1f;
		F.addDozent(this);
	}
	*/
	public void shoot() {
		if(thempAttackspeed == attackspeed) {
			Projectile Bullet = new Projectile(this);
			thempAttackspeed = 0;
		}else {
			thempAttackspeed ++;
		}
		
	}
	
	public void setField(Field F) {
		myField = F;
		Pos = F.getPos();
	}
	

	public Position getPos() {
		return Pos;
	}

	public void setPos(Position pos) {
		Pos = pos;
	}

	public Field getMyField() {
		return myField;
	}

	public void setMyField(Field myField) {
		this.myField = myField;
	}

	public attackType getAttackType() {
		return attackType;
	}

	public void setAttackType(attackType attackType) {
		this.attackType = attackType;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getIntensity() {
		return intensity;
	}
	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
	public float getSpeet() {
		return BulletSpeet;
	}
	public void setSpeet(float speet) {
		this.BulletSpeet = speet;
	}
	
	
	
	
		
	
	


}
