package StudentenVsDozenten.gui;

import StudentenVsDozenten.Hilfsklasse.Position;

public class SetupGame {

    public static GameFrame gameFrame = new GameFrame();
    public static ContainerPanel spielfeld = new ContainerPanel();
    public static ContainerPanel seitenmenue = new ContainerPanel();
    
    ContainerPanel myContainerPanel;
    GameFrame  mygameFrame;
    public SetupGame() {
    	mygameFrame = gameFrame;
    	myContainerPanel = spielfeld;
        gameFrame.addContainerPanel(myContainerPanel);
        gameFrame.pack(); // Resize the JFrame to fit its components
        gameFrame.setVisible(true); 
        //System.out.println(">>:"+getClass().getResource("fisch.PNG"));
       // MapObject mapObject = new MapObject(getClass().getResource("fisch.PNG"), new Position(0,0,100,100),spielfeld);
    }
}
