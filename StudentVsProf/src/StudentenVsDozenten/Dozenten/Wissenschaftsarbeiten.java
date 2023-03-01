package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.PlayingField;

public class Wissenschaftsarbeiten {
	Position myPosition;
	int wissenswert;

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
}
