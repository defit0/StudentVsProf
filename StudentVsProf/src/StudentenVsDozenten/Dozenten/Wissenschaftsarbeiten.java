package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Dozenten.AttackTypen.attackType;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

import java.net.URL;

public class Wissenschaftsarbeiten implements Visible {
	Position myPosition;
	Field myField;
	int wissenswert;
	public URL imagePath = getClass().getResource("knowledge_ball_gro.png");
	public MapObject mapObject;

	public Wissenschaftsarbeiten(int wissenswert, Position pos) {
		this.myPosition = new Position(pos.getxPosition(),pos.getyPosition(),100,100);
		this.wissenswert = wissenswert;
		zufallsPos();
		PlayingField.Paper.add(this);
		this.createMapObject();
	}

	public void zufallsPos() {
		Position testPosition = new Position(myPosition);
		do {			
			testPosition = myPosition.addXY(((float) Math.random() - 0.5f)*100, ((float) Math.random() - 0.5f)*100);
		}while(!PlayingField.GameMap.isPositionInMap(myPosition));
		myPosition = testPosition;
	}
	
	/*
	public void zufallsPos() {
			myPosition = myPosition.addX(((float) Math.random() - 0.5f)*200);
			myPosition = myPosition.addY(((float) Math.random() - 0.5f)*200);
	}*/
	
	
	@Override
	public String toString() {
		return "W-Arbeit [Wissenswert: " + wissenswert + " Position " + myPosition + "]";
	}


	@Override
	public void createMapObject() {
		mapObject = new MapObject(imagePath, myPosition, SetupGame.spielfeld, this);
	}
	
	@Override
	public void updateMapObject() {
	}

	@Override
	public void getClicked() {
		
		
		PlayingField.addWissenspunkte(wissenswert);
		mapObject.remove();
		mapObject = null;
		PlayingField.Paper.remove(this);
		SetupGame.spielfeld.repaint();
	}
}
