package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;
import StudentenVsDozenten.sql.Client;

public class StandardTestat extends Dozent implements Visible  {
	public URL imagePath = getClass().getResource("Dozent_StandardTestat.png");
	

	public StandardTestat(Field F){
		this.hitpoints = 60;
		this.myField = F;
		this.Pos = new Position(F.getPos().getxPosition(), F.getPos().getyPosition(), 100, 100);
		F.addDozent(this);
		this.createMapObject();
		Client.addScore(1);
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
