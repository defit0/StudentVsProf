package StudentenVsDozenten.Timer;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
    int time = 1000;
    Timer timer = new Timer();
    public boolean isRunnig = false;
    ArrayList<TimerAction> ActionList = new ArrayList<TimerAction>();

    public void setTimerTime(int time) {
        this.time = time;
    }

    public GameTimer() {

    }

    public GameTimer(int time) {
        setTimerTime(time);
    }

    public void start() {
        isRunnig = true;
        creatTimer();
    }

    public void stopp() {
        isRunnig = false;
        timer.cancel();
    }

    private void creatTimer() {
        TimerTask toDo = new TimerTask() {

            @Override
            public void run() {
                isRunnig = false;
                ArrayList<TimerAction> tuDo = new ArrayList<TimerAction>(ActionList);
                for (TimerAction at : tuDo) {
                    at.TimerActionPerform();
                }
                isRunnig = true;
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