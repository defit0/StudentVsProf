package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Timer.TimerAction;

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
