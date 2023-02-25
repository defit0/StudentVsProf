package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import DozentenVsStudenten.Dozenten.Dozent;
import DozentenVsStudenten.Map.Field;
import DozentenVsStudenten.Map.PlayingField;
import DozentenVsStudenten.Map.Series;

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
