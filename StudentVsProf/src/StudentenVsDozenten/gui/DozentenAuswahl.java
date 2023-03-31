package StudentenVsDozenten.gui;

import java.awt.Color;
import java.net.URL;

import javax.swing.JLabel;

import StudentenVsDozenten.Auswahl.Team;
import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.TestDozent;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;

public class DozentenAuswahl extends ContainerPanel implements Visible {
	URL Doz;
	JLabel JKosten = new JLabel();
	boolean avaliabe;
	int kosten;
	public static int size = 100;
	int ausDoz;
	
	public DozentenAuswahl(URL s, int d){
		Doz = s;
		this.setSize(100, 100);
		JKosten.setBounds(90, 90, 10, 10);
		this.setBackground(Color.BLACK);
		ausDoz = d;
		createMapObject();
	}

	public int getAusDoz() {
		return ausDoz;
	}
 
	public void setAusDoz(int ausDoz) {
		this.ausDoz = ausDoz;
	}
	
	@Override
	public void createMapObject() {
		MapObject mapObj = new MapObject(Doz, new Position(0, 0, size, size), this, this);
	}

	@Override
	public void updateMapObject() {

	}

	@Override
	public void getClicked() {
		Field.setzeDoz = true;
		Field.dozArt = ausDoz;
		
		//System.out.println("Art des Dozenten ");
		
		
		SetupGame.spielfeld.repaint();
	}
}
