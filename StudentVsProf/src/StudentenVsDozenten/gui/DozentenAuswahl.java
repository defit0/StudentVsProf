package StudentenVsDozenten.gui;

import java.awt.Color;
import java.net.URL;

import javax.swing.JLabel;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Hilfsklasse.Position;

public class DozentenAuswahl extends ContainerPanel {
	URL Doz;
	JLabel JKosten = new JLabel();
	boolean avaliabe;
	int kosten;
	public static int size = 100;
	
	public DozentenAuswahl(URL s){
		Doz = s;
		MapObject mapObj = new MapObject(Doz, new Position(0, 0, size, size), this);
		this.setSize(100, 100);
		JKosten.setBounds(90, 90, 10, 10);
		this.setBackground(Color.BLACK);
	}
	
}
