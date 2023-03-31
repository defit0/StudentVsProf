package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Dozenten.AttackTypen.attackType;
import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.inLineTwo;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.inTrippelLineInfinete;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Timer.TimerAction;
import StudentenVsDozenten.gui.MapObject;

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
	float intensity;
	float BulletSpeet;
	public MapObject mapObject;
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
			Projectile Bullet = new Projectile(this,Pos);
			thempAttackspeed = 0;
		}else {
			thempAttackspeed ++;
		}
		
	}
	
	private void die() {
		if(percBehav != null) {
			percBehav.stop();
		}	
		myField.setDoz(null);
		//percBehav = null;
		mapObject.remove();
		mapObject = null;
		Pos = null;
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
	public float getIntensity() {
		return intensity;
	}
	public void setIntensity(float intensity) {
		this.intensity = intensity;
	}
	public float getSpeet() {
		return BulletSpeet;
	}
	public void setSpeet(float speet) {
		this.BulletSpeet = speet;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
		if(hitpoints <= 0) {
			die();
		}
	}

	public void TimerActionPerform() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
		
	
	


}
