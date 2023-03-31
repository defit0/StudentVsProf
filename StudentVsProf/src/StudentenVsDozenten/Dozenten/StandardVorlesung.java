package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.practice;
import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.wissensproduktion;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class StandardVorlesung extends Dozent implements Visible {
	perceptualBehaviour percBehav;
	public URL imagePath = getClass().getResource("Dozent_StandardVorlesung.png");

	
	public StandardVorlesung(Field F) {
		this.attackspeed = 6;
		this.thempAttackspeed = attackspeed;
		this.hitpoints = 10;
		this.myField = F;
		this.Pos = F.getPos();
		this.percBehav = new InLineInfinite(this);
		this.attackType = new practice();
		BulletSpeet = 0.5f;
		damage = 1;
		length = 3000;
		intensity = -0.1f;
		F.addDozent(this);
		this.createMapObject();
	}
	public void shoot() {
		System.out.println("Peng");
		if(thempAttackspeed == attackspeed) {
			Projectile Bullet = new Projectile(this);
			thempAttackspeed = 0;
		}else {
			thempAttackspeed ++;
		}
		
	}
	
	@Override
	public void createMapObject() {
		mapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld, this);
	}

	@Override
	public void updateMapObject() {
	}

	@Override
	public void getClicked() {

	}
}
