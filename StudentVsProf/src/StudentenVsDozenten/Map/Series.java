package StudentenVsDozenten.Map;

import java.net.URL;
import java.util.ArrayList;

import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Student.Student;

public class Series {
    int length = PlayingField.Edgex;
    Map map;
    int yPosition;
    Field[] Fields = new Field[length];
    URL[] url = {getClass().getResource("Carpet_1.png"), getClass().getResource("Carpet_2.png")};
    ArrayList<Student> Studenten = new ArrayList<Student>();

    public Series(int y, Map m, int n) {
        map = m;
        Position p = new Position(0, y, 100f, 100f);
        for (int size = 0; size < length; size++) {
            Field F = new Field(p.addX(size * 100), this, url[(n + (size % 2)) % 2]);
            Fields[size] = F;
        }
    }

    public Field isIn(Position P) {
        return Fields[Math.round(P.getxPosition() / PlayingField.fieldSize)];
    }

    @Override
    public String toString() {
        String S = " [";
        for (Field F : Fields) {
            S += F.toString();
        }
        return S + "]";
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

    public ArrayList<Student> getStudenten() {
        return Studenten;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        Studenten = studenten;
    }
}