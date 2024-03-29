package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.Practice;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.PerceptualBehaviour;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;
import StudentenVsDozenten.sql.Client;

public class StandardVorlesung extends Dozent implements Visible {
    PerceptualBehaviour percBehav;
    public URL imagePath = getClass().getResource("Dozent_StandardVorlesung.png");

    public StandardVorlesung(Field F) {
        this.attackspeed = 6;
        this.thempAttackspeed = attackspeed;
        this.hitpoints = 10;
        this.myField = F;
        this.Pos = F.getPos();
        this.percBehav = new InLineInfinite(this);
        this.attackType = new Practice();
        BulletSpeet = 0.5f;
        damage = 1;
        length = 3000;
        intensity = -0.1f;
        F.addDozent(this);
        this.createMapObject();
        Client.addScore(2);
    }

    public void shoot() {
        System.out.println("Peng");
        if (thempAttackspeed == attackspeed) {
            Projectile Bullet = new Projectile(this, Pos);
            thempAttackspeed = 0;
        } else {
            thempAttackspeed++;
        }
    }

    @Override
    public void createMapObject() {
        mapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld, this);
    }

    @Override
    public void updateMapObject() {
    }
    @Override
    public void getClicked() {
    }
}
