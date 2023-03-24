package StudentenVsDozenten.gui;

import StudentenVsDozenten.Hilfsklasse.Position;

public class SetupGame {

    public static GameFrame gameFrame = new GameFrame();
    public static ContainerPanel spielfeld = new ContainerPanel();
    public static ContainerPanel seitenmenue = new ContainerPanel();


    public SetupGame() {
        gameFrame.addContainerPanel(spielfeld);
        spielfeld.setSize(500, 500);
        MapObject mapObject = new MapObject("StudentenVsDozenten/gui/fisch.PNG", new Position(0,0,1));
    }
}
