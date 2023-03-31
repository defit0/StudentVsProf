package StudentenVsDozenten.Dozenten.AttackTypen;

import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Studenten.DefenseType.Genie;
import StudentenVsDozenten.Studenten.DefenseType.deaf;
import StudentenVsDozenten.Studenten.DefenseType.standart;

public abstract class attackType {

    public Effect attacPattern(deaf dt, int damage, int length, float intensity) {
        return standard(damage, length, intensity);
    }

    public Effect attacPattern(Genie dt, int damage, int length, float intensity) {
        return standard(damage, length, intensity);
    }

    public Effect attacPattern(standart dt, int damage, int length, float intensity) {
        return standard(damage, length, intensity);
    }

    abstract protected Effect standard(int damage, int length, float intensity);
}
