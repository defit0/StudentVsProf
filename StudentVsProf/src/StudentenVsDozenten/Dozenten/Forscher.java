package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Dozenten.AttackTypen.Talk;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.PerceptualBehaviour;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.Wissensproduktion;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;
import StudentenVsDozenten.sql.Client;

import java.net.URL;

public class Forscher extends Dozent implements Visible {
    PerceptualBehaviour percBehav;
    int wissenserhoehung = 1;
    public URL imagePath = getClass().getResource("Dozent_Forscher.png");


    public Forscher(Field F) {
        this.attackspeed = 5;
        this.thempAttackspeed = attackspeed;
        this.hitpoints = 6;
        this.myField = F;
        this.Pos = F.getPos();
        this.percBehav = new Wissensproduktion(this);
        this.attackType = new Talk();
        F.addDozent(this);
        this.createMapObject();
        Client.addScore(3);
    }

    public void wissengenerieren() {
        Wissenschaftsarbeiten Paper = new Wissenschaftsarbeiten(wissenserhoehung, Pos);
        System.out.println("sollte generiert werden");
    }

    public void shoot() {
        wissengenerieren();
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