package StudentenVsDozenten.gui;

import javax.swing.*;

import StudentenVsDozenten.sql.Client;

import java.awt.*;

public class GameFrame extends JFrame {

	public static ContainerPanel spielfeld;
	public static ContainerPanel seitenmenue;
	Client c1 = new Client();
	private int width = 815; // Magic Number, an GroeÃŸe von Fliesen angepasst
	private int height = 700;

	public GameFrame() {

		final JFrame parent = new JFrame();

		String name = JOptionPane.showInputDialog(parent, "What is your name?", null);
		String password = JOptionPane.showInputDialog(parent, "What is your password?", null);
		if (c1.start(name, password) == false) {
			int input = JOptionPane.showConfirmDialog(null, "Bitte stelle sicher, ob eine Internetverbindung zur Verfügung steht und ob die eingegebenen Daten korrekt eingegeben worden sind.\nNeu hier? \nRegistriere dich unter: http://hochschule.indieentwickler.net/ !", "Anmeldung fehlgeschlagen", JOptionPane.DEFAULT_OPTION);
			
			System.exit(input);
		}else {
			int input = JOptionPane.showConfirmDialog(null, "Willkomen zurück, "+Client.player +"!","Anmeldung erfolgreich", JOptionPane.DEFAULT_OPTION);
		}
		
		
		this.setTitle("Studenten vs. Dozenten");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(width, height));
		this.setResizable(false);
		this.setSize(width, height);
		// this.setLayout(new BorderLayout());
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	public void addContainerPanel(ContainerPanel panel) {
		this.add(panel);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}