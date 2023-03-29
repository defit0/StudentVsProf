package StudentenVsDozenten.Map;

import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.Wissenschaftsarbeiten;
import StudentenVsDozenten.Timer.TimerAction;

//ich bin nur um Consolenausgaben zu machen!
public class Printer implements TimerAction{

	@Override
	public void TimerActionPerform() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	    System.out.println(PlayingField.GameMap);
	    System.out.println("Du hast " + PlayingField.wissenspunkte + " Wissenspunkte.");
	    
	    for(Wissenschaftsarbeiten w : Field.Paper) {
	    	System.out.println(w);
	    }
	    //System.out.println("paper array: " + Field.Paper.size());
	}

}
