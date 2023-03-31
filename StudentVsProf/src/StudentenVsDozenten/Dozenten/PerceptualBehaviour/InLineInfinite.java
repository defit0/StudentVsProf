package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Map.Series;

public class InLineInfinite extends perceptualBehaviour{

	public InLineInfinite(Dozent doz) {
		super(doz);
	}

	@Override
	boolean ShallIshoot() {
		Series S = PlayingField.GameMap.getSeriesBy(myDozent.getPos());
		return S.hasStudents();
	}

}
