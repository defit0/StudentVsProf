package Student;

import java.util.ArrayList;

import Dozenten.attackType;
import StudentenVsDozenten.Effekte.Effect;

public class Student {

	int attackspeed;
	int speed;
	int hitpoints;
	int damage;
	DefenseType dt;
	ArrayList<Effect> AllEffects= new ArrayList<Effect>();
	
	Student(){
		this.attackspeed = 1;
		this.speed = 2;
		this.hitpoints = 8;
		this.damage = 2;
	}
	
	void gethit(int damage,attackType at) {
		Effect e = dt.getHit(damage, at);
		if (e != null) {
			AllEffects.add(e);
			e.influence(this);
		}
	}
	
	
	//alle Efecte in der Efectliste aktiveren sich
	void activateEffects() {
		for(Effect e : AllEffects) {
			e.influence(this);
		}
	}
	
	
	void getDamage(int damage){
		hitpoints -= damage;
		if(hitpoints <= 0) {
			die();
		}
	}
	
	void die(){
		System.out.println("Ich bin jetzt tot");
	}
	
	
	
	
}
