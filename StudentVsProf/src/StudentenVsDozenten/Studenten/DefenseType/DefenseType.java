package StudentenVsDozenten.Studenten.DefenseType;

import StudentenVsDozenten.Dozenten.AttackTypen.AttackType;
import StudentenVsDozenten.Effekte.Effect;

public interface DefenseType {

    public Effect getHit(int damage, AttackType at, int length, float intensity);
}
