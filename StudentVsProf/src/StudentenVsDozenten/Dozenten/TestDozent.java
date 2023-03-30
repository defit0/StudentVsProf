package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.wissensproduktion;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class TestDozent extends Dozent implements Visible {
	perceptualBehaviour percBehav;
	public URL imagePath = getClass().getResource("Dozent_StandardVorlesung.png");
	public MapObject mapObject;
	
	public TestDozent(Field F) {
		this.attackspeed = 5;
		this.thempAttackspeed = attackspeed;
		this.hitpoints = 6;
		this.myField = F;
		this.Pos = F.getPos();
		
		this.attackType = new talk();
		F.addDozent(this);
		this.createMapObject();
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
