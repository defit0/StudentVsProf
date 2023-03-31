package StudentenVsDozenten.Dozenten.AttackTypen;

import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Studenten.DefenseType.Genie;
import StudentenVsDozenten.Studenten.DefenseType.Deaf;
import StudentenVsDozenten.Studenten.DefenseType.Standard;

public abstract class AttackType {

    public Effect attacPattern(Deaf dt, int damage, int length, float intensity) {
        return standard(damage, length, intensity);
    }

    public Effect attacPattern(Genie dt, int damage, int length, float intensity) {
        return standard(damage, length, intensity);
    }

    public Effect attacPattern(Standard dt, int damage, int length, float intensity) {
        return standard(damage, length, intensity);
    }

    abstract protected Effect standard(int damage, int length, float intensity);
}
