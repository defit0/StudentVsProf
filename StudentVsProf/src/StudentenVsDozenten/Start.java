package StudentenVsDozenten;

import java.net.MalformedURLException;
import java.net.URL;


import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Map;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Map.Printer;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.Student.StudentenSetzen;
import StudentenVsDozenten.gui.ContainerPanel;
import StudentenVsDozenten.gui.GameFrame;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;

public class Start {
    static SetupGame setupGame;
    static PlayingField pf;
    static Printer p;

    public static void main(String[] args) {
        restart();
    }

    public static void restart() {
        setupGame = null;
        pf = null;
        p = null;
        System.gc();
        setupGame = new SetupGame();
        pf = new PlayingField();
        p = new Printer();
        PlayingField.gameTimer.add(p);

        StudentenSetzen TestStudenten = new StudentenSetzen();
        PlayingField.setWissenspunkte(10);
    }
}