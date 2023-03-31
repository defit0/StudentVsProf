package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Timer.TimerAction;

public abstract class perceptualBehaviour implements TimerAction {
	Dozent myDozent;
	
	perceptualBehaviour(Dozent doz){
		myDozent = doz;
		//PlayingField.wissenstimer.add(this);
		PlayingField.allePerceptualBehaviour.add(this);
	}
	
	public void TimerActionPerform() {
		if(ShallIshoot()) {
			myDozent.shoot();
		}
	}
	abstract boolean ShallIshoot();
	

}
