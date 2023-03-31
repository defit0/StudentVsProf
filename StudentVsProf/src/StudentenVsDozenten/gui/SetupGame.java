package StudentenVsDozenten.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.net.URL;

import StudentenVsDozenten.Start;
import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Timer.GameTimer;
import StudentenVsDozenten.sql.Client;

import javax.swing.*;

public class SetupGame {
    int gap = 10;

    public static JLabel wissensCounter;
    public static GameFrame gameFrame;
    public static ContainerPanel gameOverPanel;
    public static ContainerPanel spielfeld;
    public static ContainerPanel wissenspunktPanel;
    public static ContainerPanel teamleiste;

    ContainerPanel myContainerPanel;
    GameFrame mygameFrame;

    public SetupGame() {
        wissensCounter = new JLabel("Wissenspunkte: " + PlayingField.wissenspunkte, SwingConstants.CENTER);
        gameFrame = new GameFrame();
        gameOverPanel = new ContainerPanel();
        spielfeld = new ContainerPanel();
        wissenspunktPanel = new ContainerPanel();
        teamleiste = new ContainerPanel();

        mygameFrame = gameFrame;
        gameOverPanel.setBackground(Color.red);
        myContainerPanel = spielfeld;
        ContainerPanel myContainerPanel = teamleiste;
        spielfeld.setSize(PlayingField.fieldSize * PlayingField.Edgex, PlayingField.fieldSize * PlayingField.Edgey);

        wissensCounter.setSize(PlayingField.fieldSize * PlayingField.Edgex, 40);
        wissensCounter.setFont(wissensCounter.getFont().deriveFont(25.0F));

        wissenspunktPanel.setBounds(0, PlayingField.fieldSize * PlayingField.Edgey + gap, PlayingField.fieldSize * PlayingField.Edgex, 40);
        wissenspunktPanel.setBackground(Color.ORANGE);
        wissenspunktPanel.add(wissensCounter);

        teamleiste.setBounds(0, PlayingField.fieldSize * PlayingField.Edgey + wissenspunktPanel.getHeight() + gap * 2, PlayingField.fieldSize * PlayingField.Edgex, PlayingField.fieldSize);
        teamleiste.setBackground(Color.ORANGE);
        teamleiste.setLayout(null);

        gameFrame.addContainerPanel(spielfeld);
        gameFrame.addContainerPanel(wissenspunktPanel);
        gameFrame.addContainerPanel(teamleiste);

        DozentenAuswahlKomplett DozKomp = new DozentenAuswahlKomplett();
        DozKomp.fill(teamleiste);
        DozKomp.setLayout();

        gameFrame.revalidate();
        gameFrame.repaint();
    }

    public static void gameOver() {
        Client c2 = new Client();
        PlayingField.alleEfeckte.stopp();
        PlayingField.allePerceptualBehaviour.stopp();
        PlayingField.gameTimer.stopp();
        PlayingField.wissenstimer.stopp();
        PlayingField.studentenSpawner.stopp();


        JOptionPane.showConfirmDialog(null, "Du hast " + Client.score + "Punkte \nViel Glueck bein Naechsten Versuch!!!", "GAME OVER \n", JOptionPane.DEFAULT_OPTION);
        c2.endOfGame();
        gameFrame.dispose();
        Start.restart();
    }
}