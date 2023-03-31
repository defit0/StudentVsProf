package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class StandardTestat extends Dozent implements Visible  {
	public URL imagePath = getClass().getResource("Dozent_StandardTestat.png");
	

	public StandardTestat(Field F){
		this.hitpoints = 6;
		this.myField = F;
		this.Pos = F.getPos();
		F.addDozent(this);
		this.createMapObject();
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
