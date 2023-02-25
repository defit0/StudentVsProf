package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import DozentenVsStudenten.Dozenten.Dozent;
import DozentenVsStudenten.Map.Field;
import DozentenVsStudenten.Map.PlayingField;
import StudentenVsDozenten.Hilfsklasse.Position;

//überprüt ob in den beiden feldern vor dem Dozent Studenten sind und aktiviert die Schuss funktion
public class inLineTwo extends perceptualBehaviour{

	inLineTwo(Dozent doz) {
		super(doz);
	}

	@Override
	boolean ShallIshoot() {
		Field F1 = PlayingField.GameMap.getFieldIn( (int) myDozent.getPos().getyPosition(), myDozent.getPos().getyPosition());
		Position P1 = myDozent.getPos().addX(1);
		Field F2 =PlayingField.GameMap.getFieldIn((int)P1.getxPosition(),P1.getyPosition());
		Position P2 = myDozent.getPos().addX(1);
		Field F3 =PlayingField.GameMap.getFieldIn((int)P2.getxPosition(),P2.getyPosition());
		return F1.hasStudents()||F2.hasStudents()||F3.hasStudents();
	}

}
