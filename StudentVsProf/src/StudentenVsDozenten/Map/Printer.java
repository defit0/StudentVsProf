package StudentenVsDozenten.Map;

import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.Wissenschaftsarbeiten;
import StudentenVsDozenten.Timer.TimerAction;
import StudentenVsDozenten.sql.Client;

// Nur um Konsolenausgaben zu machen!
public class Printer implements TimerAction {
    int time = 0;

    @Override
    public void TimerActionPerform() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

        System.out.println("Frame: " + time + " ---------------------------------------");
        System.out.println("Timer: " + PlayingField.allePerceptualBehaviour.isRunnig);
        System.out.println(PlayingField.GameMap);
        System.out.println("Du hast " + PlayingField.wissenspunkte + " Wissenspunkte.");
        System.out.println("Frame: " + time + " ---------------------------------------");
        time++;
        if (time > 2000) {
            time = 0;
            Client.addScore(5);
        }
    }
}