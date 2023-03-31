package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.Exam;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InLineInfinite;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.PerceptualBehaviour;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;
import StudentenVsDozenten.sql.Client;

public class StandartTutorium extends Dozent implements Visible {
    PerceptualBehaviour percBehav;
    public URL imagePath = getClass().getResource("Dozent_StandartTutorium.png");

    public StandartTutorium(Field F) {
        this.attackspeed = 1;
        this.thempAttackspeed = attackspeed;
        this.hitpoints = 5;
        this.myField = F;
        this.Pos = F.getPos();
        this.percBehav = new InLineInfinite(this);
        this.attackType = new Exam();
        BulletSpeet = 1f;
        damage = 1;
        F.addDozent(this);
        this.createMapObject();
        Client.addScore(3);
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