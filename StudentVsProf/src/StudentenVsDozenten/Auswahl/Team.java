package StudentenVsDozenten.Auswahl;

import java.net.URL;
import java.util.ArrayList;

import StudentenVsDozenten.Start;
import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class Team extends Dozent implements Visible{
	public static ArrayList <Dozent> team = new ArrayList<Dozent>();
	
	public URL imagePath = getClass().getResource("Dozent_Forscher.png");
	public MapObject mapObject;

	
	
	public Team() {
		team.add(new StandardVorlesung(PlayingField.GameMap.getFieldIn(200, 300)));
	}
	

	
	
	@Override
	public void createMapObject() {
	}

	@Override
	public void updateMapObject() {
	}

	@Override
	public void getClicked() {
	}
}
