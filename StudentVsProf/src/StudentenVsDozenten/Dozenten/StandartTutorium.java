package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.Exam;
import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class StandartTutorium extends Dozent implements Visible  {
	perceptualBehaviour percBehav;
	public URL imagePath = getClass().getResource("Dozent_StandartTutorium.png");
	
	public StandartTutorium (Field F){
		this.attackspeed = 1;
		this.thempAttackspeed = attackspeed;
		this.hitpoints = 5;
		this.myField = F;
		this.Pos = F.getPos();
		this.percBehav = new InLineInfinite(this);
		this.attackType = new Exam();
		BulletSpeet = 1f;
		damage = 1;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getClicked() {
		// TODO Auto-generated method stub
		
	}

}
