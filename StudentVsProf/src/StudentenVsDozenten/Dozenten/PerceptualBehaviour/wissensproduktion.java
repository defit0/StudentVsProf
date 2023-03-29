package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Map.PlayingField;

public class wissensproduktion extends perceptualBehaviour {
	final float startchancewissen = 0.1f;
	float chancewissen = 0.1f;
	
	public wissensproduktion(Dozent doz) {
		super(doz);
		PlayingField.allePerceptualBehaviour.remove(this);
		PlayingField.wissenstimer.add(this);
	}

	@Override
	boolean ShallIshoot() {
		if(Math.random() < chancewissen){
			chancewissen = startchancewissen;
			return true;
		} else {
				chancewissen += 0.6f;
				return false;
		}
	}
}
