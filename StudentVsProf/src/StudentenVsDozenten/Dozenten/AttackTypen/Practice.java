package StudentenVsDozenten.Dozenten.AttackTypen;


import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SlowDown;

public class Practice extends AttackType {

    protected Effect standard(int damage, int length, float intensity) {
        return new SlowDown(damage, length, intensity);
    }
}