package StudentenVsDozenten.Timer;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
	final int tack = 1000;//1 Sekunde
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
				ArrayList<TimerAction> tuDo = new ArrayList<TimerAction>(ActionList);
				for(TimerAction at: tuDo) {
					at.TimerActionPerform();
				}
				
			}
			
		};
		timer.schedule(toDo, tack, tack);
	}
	
	public void add(TimerAction at) {
		ActionList.add(at);
	}
	public void remov(TimerAction at) {
		ActionList.remove(at);
	}
}
