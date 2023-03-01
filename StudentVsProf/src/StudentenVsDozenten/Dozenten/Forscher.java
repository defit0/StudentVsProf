package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.wissensproduktion;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;

public class Forscher extends Dozent {
	perceptualBehaviour percBehav;
	int wissenserhoehung = 1;
	
	public Forscher(Field F) {
		this.attackspeed = 5;
		this.thempAttackspeed = attackspeed;
		this.hitpoints = 6;
		this.myField = F;
		this.Pos = F.getPos();
		this.percBehav = new wissensproduktion(this);
		this.attackType = new talk();
		F.addDozent(this);
	}

	public void wissengenerieren() {	
		Wissenschaftsarbeiten Paper = new Wissenschaftsarbeiten(wissenserhoehung, Pos);
	}
	
	public void shoot() {
		wissengenerieren();
	}
}
