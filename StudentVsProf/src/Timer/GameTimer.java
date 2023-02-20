package Timer;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
	final int tack = 1000;
	Timer timer = new Timer();
	ArrayList<TimerAction> ActionList = new ArrayList<TimerAction>();
	
	public GameTimer(){
		
	}
	public void start() {
		creatTimer();
	}
	public void stopp() {
		timer.cancel();
	}
	
	private void creatTimer() {
		TimerTask toDo = new TimerTask() {

			@Override
			public void run() {
				for(TimerAction at: ActionList) {
					at.TimerActionPerform();
				}
				
			}
			
		};
		timer.schedule(toDo, tack, tack);
	}
	
	public void add(TimerAction at) {
		ActionList.add(at);
	}
}
