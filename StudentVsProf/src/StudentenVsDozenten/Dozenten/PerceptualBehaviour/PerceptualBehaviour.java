package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Timer.TimerAction;

public abstract class PerceptualBehaviour implements TimerAction {
    Dozent myDozent;

    PerceptualBehaviour(Dozent doz) {
        myDozent = doz;
        PlayingField.allePerceptualBehaviour.add(this);
    }

    public void TimerActionPerform() {
        if (ShallIshoot()) {
            myDozent.shoot();
        }
    }

    abstract boolean ShallIshoot();

    public void stop() {
        PlayingField.allePerceptualBehaviour.remove(this);
        PlayingField.wissenstimer.remove(this);
        myDozent = null;
    }
}