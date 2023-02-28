package StudentenVsDozenten.Map;

import StudentenVsDozenten.Timer.TimerAction;

//ich bin nur um Consolenausgaben zu machen!
public class Printer implements TimerAction{

	@Override
	public void TimerActionPerform() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	    System.out.println(PlayingField.GameMap);
		
	}

}
