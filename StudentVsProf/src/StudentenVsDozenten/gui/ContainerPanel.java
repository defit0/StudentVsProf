package StudentenVsDozenten.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class ContainerPanel extends JPanel {

    ArrayList<MapObject> mapObjects;

    public ContainerPanel() {
    	mapObjects = new ArrayList();
        this.setBackground(Color.BLUE);
        this.setVisible(true);
        this.setLayout(null);
//        JLabel objectLabel = new JLabel("toll");
//        this.add(objectLabel);
    }

    public void add(MapObject mapObject) {
        mapObjects.add(mapObject);
        revalidate();
        repaint();
    }
    public void remove(MapObject mapObject) {
        mapObjects.remove(mapObject);
    }
}