package StudentenVsDozenten.Dozenten.PerceptualBehaviour;

import StudentenVsDozenten.Dozenten.Dozent;
import StudentenVsDozenten.Map.PlayingField;

public class Wissensproduktion extends PerceptualBehaviour {
    final float startchancewissen = 0.1f;
    float chancewissen = 0.1f;

    public Wissensproduktion(Dozent doz) {
        super(doz);
        PlayingField.allePerceptualBehaviour.remove(this);
        PlayingField.wissenstimer.add(this);
    }

    @Override
    boolean ShallIshoot() {
        if (Math.random() < chancewissen) {
            chancewissen = startchancewissen;
            return true;
        } else {
            chancewissen += 0.1f;
            return false;
        }
    }
}