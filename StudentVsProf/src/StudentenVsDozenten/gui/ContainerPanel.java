package StudentenVsDozenten.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class ContainerPanel extends JPanel {

    ArrayList<MapObject> mapObjects = new ArrayList();
    private int width;
    private int height;

    public ContainerPanel() {
        this.setBackground(Color.BLUE);
        this.setVisible(true);
    }

    public void add(MapObject mapObject) {
        mapObjects.add(mapObject);
        mapObject.setPanel(this);
    }
    public void remove(MapObject mapObject) {
        mapObjects.remove(mapObject);
    }
}
