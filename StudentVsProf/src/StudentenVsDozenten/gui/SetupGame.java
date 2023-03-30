package StudentenVsDozenten.gui;

import java.awt.Color;
import java.awt.FlowLayout;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.PlayingField;

import javax.swing.*;

public class SetupGame {
	int gap = 10;

	public static JLabel wissensCounter = new JLabel("0");
    public static GameFrame gameFrame = new GameFrame();
    public static ContainerPanel spielfeld = new ContainerPanel();
    public static ContainerPanel wissenspunktLabel = new ContainerPanel();
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

        wissensCounter.setSize(20, 20);

        wissenspunktLabel.setBounds(0, PlayingField.fieldSize * PlayingField.Edgey + gap, PlayingField.fieldSize * PlayingField.Edgex, 40);
        wissenspunktLabel.setBackground(Color.CYAN);
        wissenspunktLabel.add(wissensCounter);

        teamleiste.setBounds(0, PlayingField.fieldSize * PlayingField.Edgey + wissenspunktLabel.getHeight() + gap * 2, PlayingField.fieldSize*PlayingField.Edgex, PlayingField.fieldSize);
    	teamleiste.setBackground(Color.GREEN);    
    	teamleiste.setLayout(null);

        gameFrame.addContainerPanel(spielfeld);
        gameFrame.addContainerPanel(wissenspunktLabel);
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
