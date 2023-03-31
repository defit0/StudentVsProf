package StudentenVsDozenten.Studenten.DefenseType;

import StudentenVsDozenten.Dozenten.AttackTypen.AttackType;
import StudentenVsDozenten.Effekte.Effect;

public class Standard implements DefenseType {

    @Override
    public Effect getHit(int damage, AttackType at, int length, float intensity) {
        return at.attacPattern(this, damage, length, intensity);
    }
}