package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.inTrippelLineInfinete;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class StandartUmfrage extends Dozent implements Visible {
	perceptualBehaviour percBehav;
	public URL imagePath = getClass().getResource("Dozent_StandartUmfrage.png");
	
	public StandartUmfrage(Field F){
		this.attackspeed = 3;
		this.thempAttackspeed = attackspeed;
		this.hitpoints = 6;
		this.myField = F;
		this.Pos = F.getPos();
		this.percBehav = new inTrippelLineInfinete(this);
		this.attackType = new talk();
		BulletSpeet = 0.5f;
		damage = 1;
		F.addDozent(this);
		this.createMapObject();
	}
	
	public void shoot() {
		System.out.println("Peng");
		if(thempAttackspeed == attackspeed) {
			Projectile BulletMitte = new Projectile(this);
			Projectile BulletLinks = new Projectile(this);
			Projectile BulletRechts = new Projectile(this);
			BulletLinks.Pos.addY(-100);
			BulletRechts.Pos.addY(+100);
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
