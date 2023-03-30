package StudentenVsDozenten.gui;

import java.net.URL;

public class DozentenAuswahlKomplett {
	DozentenAuswahl[] DozWahl = new DozentenAuswahl[5];
	int yPos;
	int gap = 75;
	URL[] buildPath = new URL[5];
	
	public void setLayout() {
		for(int i = 0; i < DozWahl.length; i++) {
			DozWahl[i].setLocation(i*DozentenAuswahl.size + i*gap , yPos);
		}
	}
	
	public void fill(ContainerPanel cp) {
		buildPath[0] = getClass().getResource("Dozent_Forscher.png");
		buildPath[1] = getClass().getResource("Dozent_StandardTestat.png");
		buildPath[2] = getClass().getResource("Dozent_StandardVorlesung.png");
		buildPath[3] = getClass().getResource("Dozent_StandartTutorium.png");
		buildPath[4] = getClass().getResource("Dozent_StandartUmfrage.png");
		
		for(int i = 0; i < DozWahl.length; i++) {
			DozWahl[i] = new DozentenAuswahl(buildPath[i]);
			cp.add(DozWahl[i]);
		}
	}
}

	
	