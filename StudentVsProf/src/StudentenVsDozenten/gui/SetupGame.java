package StudentenVsDozenten.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.net.URL;

import StudentenVsDozenten.Start;
import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.PlayingField;

import javax.swing.*;

public class SetupGame{
	int gap = 10;

	public static JLabel wissensCounter = new JLabel("Wissenspunkte: 0", SwingConstants.CENTER);
    public static GameFrame gameFrame = new GameFrame();
    public static ContainerPanel gameOverPanel = new ContainerPanel();;
    public static ContainerPanel spielfeld = new ContainerPanel();
    public static ContainerPanel wissenspunktPanel = new ContainerPanel();
    public static ContainerPanel teamleiste = new ContainerPanel();
    
    ContainerPanel myContainerPanel;
    GameFrame  mygameFrame;
   /* 
    ContainerPanel teamContainerPanel;
    GameFrame  teamgameFrame;
    */
    public SetupGame() {
    	mygameFrame = gameFrame;
    	gameOverPanel.setBackground(Color.red);
    	myContainerPanel = spielfeld;
    	ContainerPanel myContainerPanel = teamleiste;
    	spielfeld.setSize(PlayingField.fieldSize * PlayingField.Edgex, PlayingField.fieldSize * PlayingField.Edgey);

        wissensCounter.setSize(PlayingField.fieldSize * PlayingField.Edgex, 40);
        wissensCounter.setFont(wissensCounter.getFont().deriveFont(25.0F));

        wissenspunktPanel.setBounds(0, PlayingField.fieldSize * PlayingField.Edgey + gap, PlayingField.fieldSize * PlayingField.Edgex, 40);
        wissenspunktPanel.setBackground(Color.CYAN);
        wissenspunktPanel.add(wissensCounter);

        teamleiste.setBounds(0, PlayingField.fieldSize * PlayingField.Edgey + wissenspunktPanel.getHeight() + gap * 2, PlayingField.fieldSize*PlayingField.Edgex, PlayingField.fieldSize);
    	teamleiste.setBackground(Color.GREEN);    
    	teamleiste.setLayout(null);

        gameFrame.addContainerPanel(spielfeld);
        gameFrame.addContainerPanel(wissenspunktPanel);
        gameFrame.addContainerPanel(teamleiste);
        
        //DozentenAuswahl Doz = new DozentenAuswahl();
        //teamleiste.add(Doz);
        //teamleiste.setComponentZOrder(Doz, 0);
        DozentenAuswahlKomplett DozKomp = new DozentenAuswahlKomplett();
        DozKomp.fill(teamleiste);
        DozKomp.setLayout();

        gameFrame.revalidate();
        gameFrame.repaint();
    }
    public static void gameOver() {
    	/*
    	System.out.println("Du bist ein VERSAGER!!!");
    	
    	gameFrame.remove(spielfeld);
    	gameFrame.remove(teamleiste);
    	gameFrame.remove(wissenspunktPanel);
    	gameFrame.add(gameOverPanel);
    	System.exit(0);
		Start.main(null);
    	*/
    	
		JOptionPane.showConfirmDialog(null, "GAME OVER \n","Viel Glück bein Nächsten Versuch!!!", JOptionPane.DEFAULT_OPTION);
		
    	Start.restart();
	}

}
