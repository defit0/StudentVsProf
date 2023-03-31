package StudentenVsDozenten.Map;

import java.util.ArrayList;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Student.Student;

public class Series {
int length = PlayingField.Edgex ;
Map map;
int yPosition;
Field [] Fields = new Field [length];
ArrayList<Student> Studenten = new ArrayList<Student>();

	public Series(int y,Map m) {
		map = m;
		Position p = new Position(0, y, 100f, 100f);
		for( int size = 0; size < length;size ++) {
			Field F = new Field(p.addX(size*100),this);
			Fields[size] = F;
		}
	}
	
	public Field isIn(Position P) {
		return Fields[Math.round(P.getxPosition()/PlayingField.fieldSize)];
	}

	@Override
	public String toString() {
		String S = " [";
		for(Field F : Fields) {
			S += F.toString();
		}
		return S +"]";
	}
	 public boolean hasStudents() {
		 return !Studenten.isEmpty();
	 }
	 
	public void addStudent(Student S) {
		Studenten.add(S);
	}
	
	public void removStudent(Student s) {
		Studenten.remove(s);
	}
	
}
