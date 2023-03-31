package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.Talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.InTrippelLineInfinete;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.PerceptualBehaviour;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;
import StudentenVsDozenten.sql.Client;

public class StandartUmfrage extends Dozent implements Visible {
    PerceptualBehaviour percBehav;
    public URL imagePath = getClass().getResource("Dozent_StandartUmfrage.png");

    public StandartUmfrage(Field F) {
        this.attackspeed = 5;
        this.thempAttackspeed = attackspeed;
        this.hitpoints = 6;
        this.myField = F;
        this.Pos = F.getPos();
        this.percBehav = new InTrippelLineInfinete(this);
        this.attackType = new Talk();
        BulletSpeet = 0.6f;
        damage = 1;
        F.addDozent(this);
        this.createMapObject();
        Client.addScore(5);
    }

    public void shoot() {
        System.out.println("Peng");
        if (thempAttackspeed == attackspeed) {
            Projectile BulletMitte = new Projectile(this, Pos);
            Projectile BulletLinks = new Projectile(this, Pos.addY(-100));
            Projectile BulletRechts = new Projectile(this, Pos.addY(+100));
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
        // TODO Auto-generated method stub
    }

    @Override
    public void getClicked() {
        // TODO Auto-generated method stub

    }
}