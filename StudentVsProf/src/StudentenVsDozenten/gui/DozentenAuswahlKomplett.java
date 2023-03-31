package StudentenVsDozenten.gui;

import java.net.URL;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
import StudentenVsDozenten.Map.PlayingField;

public class DozentenAuswahlKomplett {
	DozentenAuswahl[] DozWahl = new DozentenAuswahl[5];
	int yPos;
	int gap = 75;
	URL[] buildPath = new URL[5];
	public static int[] dozAusw = new int[5];
	int [] kosten = {
			3, 1, 3, 3, 3
	};
	
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
		

		dozAusw[0] = 0;
		dozAusw[1] = 1;
		dozAusw[2] = 2;
		dozAusw[3] = 3;
		dozAusw[4] = 4;

		
		for(int i = 0; i < DozWahl.length; i++) {
			DozWahl[i] = new DozentenAuswahl(buildPath[i], dozAusw[i], kosten[i]);
			cp.add(DozWahl[i]);
		}
	}
}
