package StudentenVsDozenten.Effekte;

import StudentenVsDozenten.Student.Student;

public class SlowDown implements Effect {
    int duration;
    float speedMalus;
    int Damage;

    public SlowDown(int Damage, int duration, float malus) {
        this.Damage = Damage;
        this.duration = duration;
        this.speedMalus = malus;
    }

    @Override
    public void influence(Student S) {
        if (duration == 0) {
            S.setSpeed(S.getSpeed() - speedMalus);
            S.AllEffects.remove(this);

        } else {
            duration--;
        }
    }

    @Override
    public void influenceFirst(Student S) {
        S.getDamage(Damage);
        boolean found = false;
        SlowDown otherEffect = null;

        for (Effect E : S.AllEffects) {
            if (E.getClass() == this.getClass() && !this.equals(E)) {
                found = true;
                otherEffect = (SlowDown) E;
            }
        }

        if (found) {
            if (otherEffect.getDuration() < duration) {
                otherEffect.setDuration(duration);
            }
            S.AllEffects.remove(this);
        } else {
            S.setSpeed(S.getSpeed() + speedMalus);
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "SlowDown [duration=" + duration + ", speedMalus=" + speedMalus + ", Damage=" + Damage + "]";
    }
}