package StudentenVsDozenten.Dozenten.AttackTypen;

import StudentenVsDozenten.Effekte.Effect;
import StudentenVsDozenten.Effekte.SingleDamage;
import StudentenVsDozenten.Studenten.DefenseType.Deaf;

public class Talk extends AttackType {
    @Override
    public Effect attacPattern(Deaf dt, int damage, int length, float intensity) {
        return new SingleDamage((int) Math.round(damage * 0.5));
    }

    @Override
    protected Effect standard(int damage, int length, float intensity) {
        return new SingleDamage(damage);
    }
}
