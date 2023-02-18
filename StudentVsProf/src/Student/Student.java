package Student;

import java.util.ArrayList;

import Dozenten.attackType;
import StudentenVsDozenten.Effekte.Effect;
import Timer.TimerAction;

public class Student implements TimerAction{

	int attackspeed;
	int speed;
	int hitpoints;
	int damage;
	DefenseType dt;
	public ArrayList<Effect> AllEffects= new ArrayList<Effect>();
	
	public Student(){
		this.attackspeed = 1;
		this.speed = 2;
		this.hitpoints = 8;
		this.damage = 2;
		this.dt = new standart();
	}
	
	public void gethit(int damage,attackType at,int length,int intensity) {
		Effect e = dt.getHit(damage, at, length, intensity);
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
	
	
	public void getDamage(int damage){
		hitpoints -= damage;
		if(hitpoints <= 0) {
			die();
		}
	}
	
	void die(){
		System.out.println("Ich bin jetzt tot");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Student [attackspeed=" + attackspeed + ", speed=" + speed + ", hitpoints=" + hitpoints + ", damage="
				+ damage + ", dt=" + dt.getClass() + ", AllEffects=" + AllEffects + "]";
	}

	public DefenseType getDt() {
		return dt;
	}

	public void setDt(DefenseType dt) {
		this.dt = dt;
	}

	@Override
	public void TimerActionPerform() {
		activateEffects();
		System.out.println(this);
		
	}
	
	
	
	
}
