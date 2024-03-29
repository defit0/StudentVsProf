package StudentenVsDozenten.Dozenten;

import java.net.URL;

import StudentenVsDozenten.Dozenten.AttackTypen.AttackType;
import StudentenVsDozenten.Hilfsklasse.Position;
import StudentenVsDozenten.Map.Field;
import StudentenVsDozenten.Map.PlayingField;
import StudentenVsDozenten.Student.Student;
import StudentenVsDozenten.Timer.TimerAction;
import StudentenVsDozenten.gui.MapObject;
import StudentenVsDozenten.gui.SetupGame;
import StudentenVsDozenten.gui.Visible;

public class Projectile implements TimerAction, Visible {
    public URL imagePath = getClass().getResource("Bullet.png");
    public MapObject mapObject;
    Dozent Doz;
    AttackType attackType;
    Position Pos;
    Field F;
    int damage;
    int EfecktLength;
    float intensity;
    float speet;
    float length = 50f;
    float height = 50f;
    boolean generiert = false;
    float gap = 10f;

    public Projectile(Dozent d, Position Pos) {
        PlayingField.gameTimer.add(this);
        Doz = d;
        attackType = d.getAttackType();
        this.Pos = new Position(Pos.getxPosition() + gap * 3, Pos.getyPosition() + gap, length, height);
        createMapObject();
        F = PlayingField.GameMap.getFieldIn((int) Pos.getxPosition(), (int) Pos.getyPosition());
        damage = d.getDamage();
        EfecktLength = d.getLength();
        intensity = d.getIntensity();
        speet = d.getSpeet();

        System.out.println("neue Bulet");
        generiert = true;
    }

    void flay() {
        F.subProjectile(this);
        Position tempPos = Pos.addX(speet);
        if (Math.round(tempPos.getxPosition()) >= (PlayingField.Edgex - 1) * PlayingField.fieldSize) {
            removMe();
            return;
        }
        Pos = tempPos;
        F = F.getS().isIn(Pos);
        F.addProjectile(this);
        if (CheckAndHit()) {
            removMe();
        }
        updateMapObject();
    }

    Student Checkhits() {
        if (!PlayingField.GameMap.getSeriesBy(Pos.getyPosition()).hasStudents())
            return null;
        for (Student s : PlayingField.GameMap.getSeriesBy(Pos.getyPosition()).getStudenten()) {
            if (Position.Colied(Pos, s.getPos())) {
                return s;
            }
        }
        return null;
    }

    boolean CheckAndHit() {
        Student S = Checkhits();
        if (S != null) {
            S.gethit(damage, attackType, EfecktLength, intensity);
            return true;
        }
        return false;
    }

    void removMe() {
        F.subProjectile(this);
        PlayingField.gameTimer.remove(this);
        mapObject.remove();
        SetupGame.spielfeld.repaint();
    }

    @Override
    public void TimerActionPerform() {
        if (!generiert)
            return;
        flay();
    }

    @Override
    public String toString() {
        return "Projectile [Pos=" + Pos.getxPosition() + "/" + Pos.getyPosition() + "]";
    }

    @Override
    public void createMapObject() {
        mapObject = new MapObject(imagePath, Pos, SetupGame.spielfeld, this);

    }

    @Override
    public void updateMapObject() {
        if (!generiert)
            return;
        if (!Pos.equals(mapObject.getPosition())) {
            mapObject.setObjectPosition(Pos);
        }
    }

    @Override
    public void getClicked() {
        // TODO Auto-generated method stub
    }
}
