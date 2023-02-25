package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import DozentenVsStudenten.Dozenten.Dozent;
import DozentenVsStudenten.Map.Field;
import DozentenVsStudenten.Map.PlayingField;
import DozentenVsStudenten.Map.Series;
import StudentenVsDozenten.Hilfsklasse.Position;
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
		Position P1 = myDozent.getPos().addY(1);
		if(PlayingField.GameMap.isPositionInMap(P1)) {
			Series S2 = PlayingField.GameMap.getSeriesBy(myDozent.getPos().addY(1));
			f2 = S2.hasStudents();
		}		
		Position P2 = myDozent.getPos().addY(-1);
		if(PlayingField.GameMap.isPositionInMap(P2)) {
			Series S3 = PlayingField.GameMap.getSeriesBy(myDozent.getPos().addY(-1));
			f3 = S3.hasStudents();
		}
		
		return f1||f2||f3;
	}

}
