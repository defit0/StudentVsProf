package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import DozentenVsStudenten.Dozenten.Dozent;
import DozentenVsStudenten.Map.PlayingField;
import DozentenVsStudenten.Map.Series;

public class inTrppelLineInfinete extends perceptualBehaviour{

	public inTrppelLineInfinete(Dozent doz) {
		super(doz);
	}

	@Override
	boolean ShallIshoot() {
		Series S = PlayingField.GameMap.getSeriesBy(myDozent.getPos());
		return !S.hasStudents();
	}{

}
