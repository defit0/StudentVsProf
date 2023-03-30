package StudentenVsDozenten.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.PlayingField;

public class SetupGame {
	int gap = 10;
	
	
    public static GameFrame gameFrame = new GameFrame();
    public static ContainerPanel spielfeld = new ContainerPanel();
    
    
    public static ContainerPanel teamleiste = new ContainerPanel();
    
   // ContainerPanel myContainerPanel;
   //GameFrame  mygameFrame;
   /* 
    ContainerPanel teamContainerPanel;
    GameFrame  teamgameFrame;
    */
    public SetupGame() {
    	//mygameFrame = gameFrame;
    	//myContainerPanel = spielfeld;
    	ContainerPanel myContainerPanel = teamleiste;
    	spielfeld.setSize(PlayingField.fieldSize*PlayingField.Edgex, PlayingField.fieldSize*PlayingField.Edgey);
    	teamleiste.setBounds(0, PlayingField.fieldSize*PlayingField.Edgey + gap, PlayingField.fieldSize*PlayingField.Edgex, PlayingField.fieldSize);
    	teamleiste.setBackground(Color.GREEN);    
    	teamleiste.setLayout(null);
    	
        gameFrame.addContainerPanel(spielfeld);
        gameFrame.addContainerPanel(teamleiste);
        
        //DozentenAuswahl Doz = new DozentenAuswahl();
        //teamleiste.add(Doz);
        //teamleiste.setComponentZOrder(Doz, 0);
        DozentenAuswahlKomplett DozKomp = new DozentenAuswahlKomplett();
        DozKomp.fill(teamleiste);
        DozKomp.setLayout();
        
        
        gameFrame.pack(); // Resize the JFrame to fit its components
        gameFrame.setVisible(true); 
        //System.out.println(">>:"+getClass().getResource("fisch.PNG"));
        // MapObject mapObject = new MapObject(getClass().getResource("fisch.PNG"), new Position(0,0,100,100),spielfeld);
        /*
        teamgameFrame = gameFrame;
        teamContainerPanel = teamleiste;
        gameFrame.addContainerPanel(teamContainerPanel);
        */
        gameFrame.revalidate();
        gameFrame.repaint();
    }
}
