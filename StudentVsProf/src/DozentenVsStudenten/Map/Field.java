package DozentenVsStudenten.Map;

import java.util.ArrayList;

import DozentenVsStudenten.Dozenten.Dozent;
import DozentenVsStudenten.Dozenten.Projectile;
import DozentenVsStudenten.Student.Student;
import StudentenVsDozenten.Hilfsklasse.Position;

public class Field {
Position Pos;
Series S;
Dozent Doz;
ArrayList<Student> Studenten = new ArrayList<Student>();
ArrayList<Projectile> Bullets = new ArrayList<Projectile>();//themporer muss vieleicht wieder raus

 public Field(Position p, Series s) {
	 Pos = p;
	 S = s;
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
	if(Doz != null) {
		s = "X";
	}else if(!Studenten.isEmpty()) {
		s = "P";
	}else if(!Bullets.isEmpty()){
		s = "°";
	}else {
		s = " ";
	}
	return "["+s+"]";
}
 
 
}
