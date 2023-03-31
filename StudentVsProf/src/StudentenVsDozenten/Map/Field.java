package StudentenVsDozenten.Map;

import java.net.URL;
import java.util.ArrayList;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Dozenten.Projectile;
import StudentenVsDozenten.Dozenten.Wissenschaftsarbeiten;
import StudentenVsDozenten.Dozenten.TestDozent;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class Field implements Visible{
Position Pos;
Series S;
Dozent Doz;
ArrayList<Student> Studenten = new ArrayList<Student>();
ArrayList<Projectile> Bullets = new ArrayList<Projectile>();//themporer muss vieleicht wieder raus
MapObject myMapObject;
URL imagePath = getClass().getResource("fliese.jpg");
// public static ArrayList <Wissenschaftsarbeiten> Paper = new ArrayList<Wissenschaftsarbeiten>();

 public Field(Position p, Series s) {
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

	@Override
	public void getClicked() {

	}
}