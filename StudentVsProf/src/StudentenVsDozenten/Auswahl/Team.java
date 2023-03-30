package StudentenVsDozenten.Auswahl;

import java.net.URL;
import java.util.ArrayList;

import StudentenVsDozenten.Start;
import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.TestDozent;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class Team extends Dozent implements Visible{
	static int teamGroesse = 4;
	static Dozent[] team = new Dozent[teamGroesse];
	
	public URL imagePath = getClass().getResource("Dozent_Forscher.png");
	public MapObject mapObject;

	
	
	public Team() {
		team[0] = new Forscher(PlayingField.GameMap.getFieldIn(0, 400));
		team[1] = new Forscher(PlayingField.GameMap.getFieldIn(0, 0));
		team[2] = new Forscher(PlayingField.GameMap.getFieldIn(300, 100));
		team[3] = new TestDozent(PlayingField.GameMap.getFieldIn(200, 200));

	}
	

	
	
	@Override
	public void createMapObject() {
	//	mapObject = new MapObject(imagePath, Pos, SetupGame.teamleiste);
	}

	@Override
	public void updateMapObject() {
	}

	@Override
	public void getClicked() {

	}
}
