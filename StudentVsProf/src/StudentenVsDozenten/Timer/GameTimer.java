package StudentenVsDozenten.Timer;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
	int time = 1000;//1 Sekunde
	Timer timer = new Timer();
	ArrayList<TimerAction> ActionList = new ArrayList<TimerAction>();
	
	public void setTimerTime(int time) {
		this.time = time;
	}
	
	public GameTimer(){
		
	}
	
	public GameTimer(int time){
		setTimerTime(time);
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
		timer.schedule(toDo, time, time);
	}
	
	public void add(TimerAction at) {
		ActionList.add(at);
	}
	public void remove(TimerAction at) {
		ActionList.remove(at);
	}
}
