package StudentenVsDozenten.Dozenten;

import StudentenVsDozenten.Dozenten.AttackTypen.AttackType;
import StudentenVsDozenten.Dozenten.PerceptualBehaviour.PerceptualBehaviour;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.sql.Client;

public abstract class Dozent {

    int attackspeed;
    int thempAttackspeed;
    int hitpoints;
    Position Pos;
    Field myField;
    AttackType attackType;
    PerceptualBehaviour percBehav;
    int damage;
    int length;
    float intensity;
    float BulletSpeet;
    public MapObject mapObject;

    public void shoot() {
        if (thempAttackspeed == attackspeed) {
            Projectile Bullet = new Projectile(this, Pos);
            thempAttackspeed = 0;
        } else {
            thempAttackspeed++;
        }
    }

    private void die() {
        if (percBehav != null) {
            percBehav.stop();
        }
        myField.setDoz(null);
        mapObject.remove();
        mapObject = null;
        Pos = null;
        Client.addScore(-3);
    }

    public void setField(Field F) {
        myField = F;
        Pos = F.getPos();
    }


    public Position getPos() {
        return Pos;
    }

    public void setPos(Position pos) {
        Pos = pos;
    }

    public Field getMyField() {
        return myField;
    }

    public void setMyField(Field myField) {
        this.myField = myField;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getIntensity() {
        return intensity;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public float getSpeet() {
        return BulletSpeet;
    }

    public void setSpeet(float speet) {
        this.BulletSpeet = speet;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
        if (hitpoints <= 0) {
            die();
        }
    }

    public void TimerActionPerform() {
    }
}