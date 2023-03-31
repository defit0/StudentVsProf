package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Map.Series;
//überprüft ob in diesr Line oder den beiden benachbarten Linien ein Student ist
public class inTrippelLineInfinete extends perceptualBehaviour{

	public inTrippelLineInfinete(Dozent doz) {
		super(doz);
	}

	@Override
	boolean ShallIshoot() {
		
		
		Position P0 = myDozent.getPos();
		boolean f1 = false;
		boolean f2 = false;
		boolean f3 = false;
		if(PlayingField.GameMap.isPositionInMap(P0)) {
			Series S1 = PlayingField.GameMap.getSeriesBy(myDozent.getPos());
		f1 = S1.hasStudents();
		}
		Position P1 = myDozent.getPos().addY(PlayingField.fieldSize);
		if(PlayingField.GameMap.isPositionInMap(P1)) {
			Series S2 = PlayingField.GameMap.getSeriesBy(myDozent.getPos().addY(PlayingField.fieldSize));
			f2 = S2.hasStudents();
		}		
		Position P2 = myDozent.getPos().addY(-PlayingField.fieldSize);
		if(PlayingField.GameMap.isPositionInMap(P2)) {
			Series S3 = PlayingField.GameMap.getSeriesBy(myDozent.getPos().addY(-PlayingField.fieldSize));
			f3 = S3.hasStudents();
		}
		
		return f1||f2||f3;
	}

}
