package StudentenVsDozenten.gui;

import java.awt.Color;
import java.net.URL;

import javax.swing.JLabel;

import StudentenVsDozenten.Auswahl.Team;
import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
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
	
	public DozentenAuswahl(URL s, int d, int k){
		Doz = s;
		this.setSize(100, 100);
		JKosten.setBounds(85, 5, 20, 20);
		JKosten.setText(String.valueOf(k));
		JKosten.setFont(JKosten.getFont().deriveFont(20.0F));
		this.setBackground(Color.GRAY);
		add(JKosten);
		ausDoz = d;
		kosten = k;
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
		if(PlayingField.wissenspunkte >= kosten) {
			Field.setzeDoz = true;
		}
		Field.dozArt = ausDoz;	
		SetupGame.spielfeld.repaint();
	}
}
