package StudentenVsDozenten.Map;

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
	    
	    for(Wissenschaftsarbeiten w : PlayingField.Paper) {
	    	System.out.println(w);
	    }
	}

}
