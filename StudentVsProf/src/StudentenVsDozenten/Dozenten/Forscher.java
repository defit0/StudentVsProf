package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Dozenten.AttackTypen.talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.perceptualBehaviour;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.wissensproduktion;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

import java.net.URL;
import java.util.ArrayList;

public class Forscher extends Dozent implements Visible {
	perceptualBehaviour percBehav;
	int wissenserhoehung = 1;
	public URL imagePath = getClass().getResource("Dozent_Forscher.png");
	public MapObject mapObject;


	public Forscher(Field F) {
		this.attackspeed = 5;
		this.thempAttackspeed = attackspeed;
		this.hitpoints = 6;
		this.myField = F;
		this.Pos = F.getPos();
		this.percBehav = new wissensproduktion(this);
		this.attackType = new talk();
		F.addDozent(this);
		this.createMapObject();
	}

	public void wissengenerieren() {	
		Wissenschaftsarbeiten Paper = new Wissenschaftsarbeiten(wissenserhoehung, Pos);
		System.out.println("sollte generiert werden");
	}
	
	public void shoot() {
		System.out.println("schuss");
		wissengenerieren();
	}

	@Override
	public void createMapObject() {
		mapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld);
	}

	@Override
	public void updateMapObject() {
	}
}