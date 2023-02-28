package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;

//überprüt ob in den beiden feldern vor dem Dozent Studenten sind und aktiviert die Schuss funktion
public class inLineTwo extends perceptualBehaviour{

	public inLineTwo(Dozent doz) {
		super(doz);
	}

	@Override
	boolean ShallIshoot() {
		Position P0 = myDozent.getPos();
		boolean f1 = false;
		boolean f2 = false;
		boolean f3 = false;
		if(PlayingField.GameMap.isPositionInMap(P0)) {
		Field F1 = PlayingField.GameMap.getFieldIn((int)P0.getxPosition(),P0.getyPosition());
		f1 = F1.hasStudents();
		}
		Position P1 = myDozent.getPos().addX(1);
		if(PlayingField.GameMap.isPositionInMap(P1)) {
			Field F2 =PlayingField.GameMap.getFieldIn((int)P1.getxPosition(),P1.getyPosition());
			f2 = F2.hasStudents();
		}		
		Position P2 = myDozent.getPos().addX(2);
		if(PlayingField.GameMap.isPositionInMap(P2)) {
			Field F3 =PlayingField.GameMap.getFieldIn((int)P2.getxPosition(),P2.getyPosition());
			f3 = F3.hasStudents();
		}
		
		return f1||f2||f3;
	}

}
