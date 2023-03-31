package StudentenVsDozenten.Map;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.Forscher;
import StudentenVsDozenten.Dozenten.Projectile;
import StudentenVsDozenten.Dozenten.StandardTestat;
import StudentenVsDozenten.Dozenten.Wissenschaftsarbeiten;
import StudentenVsDozenten.Dozenten.StandardVorlesung;
import StudentenVsDozenten.Dozenten.StandartTutorium;
import StudentenVsDozenten.Dozenten.StandartUmfrage;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.gui.*;

import javax.swing.*;

public class Field implements Visible {
Position Pos;
Series S;
Dozent Doz;
ArrayList<Student> Studenten = new ArrayList<Student>();
ArrayList<Projectile> Bullets = new ArrayList<Projectile>();//themporer muss vieleicht wieder raus
MapObject myMapObject;
URL imagePath = getClass().getResource("Carpet_1.png");
// public static ArrayList <Wissenschaftsarbeiten> Paper = new ArrayList<Wissenschaftsarbeiten>();

 public Field(Position p, Series s, URL url) {
	 imagePath = url;
	 Pos = p;
	 S = s;
	 createMapObject();
 }
 public boolean hasStudents() {
	 return !Studenten.isEmpty();
 }
 
 public boolean addDozent(Dozent d) {
	 if(Doz == null) {
		 Doz = d;
		 Doz.setField(this);
		 return true;
	 }else
		 return false;
 }
 
 public Position getPos() {
	 return Pos;
 }

public Series getS() {
	return S;
}

public void setS(Series s) {
	S = s;
}

public Dozent getDoz() {
	return Doz;
}

public void setDoz(Dozent doz) {
	Doz = doz;
}

public ArrayList<Student> getStudenten() {
	return Studenten;
}

public void setStudenten(ArrayList<Student> studenten) {
	Studenten = studenten;
}

public void setPos(Position pos) {
	Pos = pos;
}
public void addStudent(Student s) {
	Studenten.add(s);
	S.addStudent(s);
}

public void removStudent(Student s) {
	Studenten.remove(s);
	S.removStudent(s);
}

public void addProjectile(Projectile p) {
	Bullets.add(p);
}
public void subProjectile(Projectile p) {
	Bullets.remove(p);
}


@Override
public String toString() {
	String s;
//	return "["+Pos.getxPosition()+"/"+Pos.getyPosition()+"]";
	if(Doz != null) {
		s = "X";
	}else if(!Studenten.isEmpty()) {
		s = "P";
	}else if(!Bullets.isEmpty()){
		s = "*";
	}else {
		s = " ";
	}
	return "["+s+"]";
}
@Override
public void createMapObject() {
	System.out.println(imagePath);
	myMapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld,true, this	);
}
@Override
public void updateMapObject() {
	// TODO Auto-generated method stub
	}

public static boolean setzeDoz = false;
public static Dozent feldDoz;
public static int dozArt;

@Override
public void getClicked() {
	
	System.out.println("Feld wurde geklickt");
	
	if(setzeDoz == true) {
		Dozent neurDoz;
	
		switch (dozArt) {
	    case 0:
	    	neurDoz = new Forscher(this);
	    	PlayingField.addWissenspunkte(-3);
	    	break;
	    case 1:
	    	neurDoz = new StandardTestat(this);
	    	PlayingField.addWissenspunkte(-1);
	    	break;
	    case 2:
	    	neurDoz = new StandardVorlesung(this);
	    	PlayingField.addWissenspunkte(-2);
	    	break;
	    case 3:
	    	neurDoz = new StandartTutorium(this);
	    	PlayingField.addWissenspunkte(-3);
	    	break;
	    case 4:
	    	neurDoz = new StandartUmfrage(this);
	    	PlayingField.addWissenspunkte(-5);

		this.setDoz(neurDoz);
		
		}
		DozentenAuswahl da = (DozentenAuswahl) SetupGame.teamleiste.getComponent(dozArt);
		da.JKosten.setForeground(Color.BLACK);
		setzeDoz = false;
	}
	SetupGame.spielfeld.repaint();
}
}