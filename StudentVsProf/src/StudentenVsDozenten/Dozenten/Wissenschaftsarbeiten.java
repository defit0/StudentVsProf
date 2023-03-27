package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

import java.net.URL;

public class Wissenschaftsarbeiten implements Visible {
	Position myPosition;
	int wissenswert;
	public URL imagePath = getClass().getResource("knowledge_ball_gro.png");
	public MapObject mapObject;

	public Wissenschaftsarbeiten(int wissenswert, Position pos) {
		this.myPosition = pos;
		this.wissenswert = wissenswert;
		zufallsPos();
		PlayingField.Paper.add(this);
	}
	
	public void anklicken() {
		PlayingField.wissenspunkte += wissenswert;
	}
	
	public void zufallsPos() {
		do {
			myPosition = myPosition.addX((float) Math.random() - 0.5f);
			myPosition = myPosition.addY((float) Math.random() - 0.5f);
		}while(!PlayingField.GameMap.isPositionInMap(myPosition));
	
	}
	
	
	@Override
	public String toString() {
		return "W-Arbeit [Wissenswert: " + wissenswert + "Position " + myPosition + "]";
	}

	@Override
	public void createMapObject() {

	}

	@Override
	public void updateMapObject() {
		mapObject = new MapObject(imagePath, myPosition, SetupGame.spielfeld);
	}
}
