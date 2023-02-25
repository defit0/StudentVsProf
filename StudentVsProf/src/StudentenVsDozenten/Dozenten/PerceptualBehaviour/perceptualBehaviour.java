package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import DozentenVsStudenten.Dozenten.Dozent;
import DozentenVsStudenten.Map.PlayingField;
import DozentenVsStudenten.Timer.TimerAction;

public abstract class perceptualBehaviour implements TimerAction {
	Dozent myDozent;
	
	perceptualBehaviour(Dozent doz){
		myDozent = doz;
		PlayingField.allePerceptualBehaviour.add(this);
	}
	
	public void TimerActionPerform() {
		if(ShallIshoot()) {
			myDozent.Shoot();
		}
	}
	abstract boolean ShallIshoot();
	

}
