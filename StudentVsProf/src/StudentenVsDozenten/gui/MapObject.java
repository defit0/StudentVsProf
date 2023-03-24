package StudentenVsDozenten.gui;

import StudentenVsDozenten.Hilfsklasse.Position;

import javax.swing.*;

public class MapObject {
    ImageIcon objectIcon = new ImageIcon();
    JLabel objectLabel = new JLabel();
    Position objectPosition;
    boolean isVisible = true;
    ContainerPanel panel = new ContainerPanel();

    public MapObject(String imageIcon, Position p) {
        SetupGame.spielfeld.add(this);
        objectIcon = new ImageIcon(imageIcon);
        objectLabel.setIcon(objectIcon);
        objectLabel.setBounds(0, 0, 400, 400);
        objectLabel.setVisible(true);
        this.objectPosition = p;
        panel.add(objectLabel);
    }

    public ContainerPanel getPanel() {
        return panel;
    }
    public void setPanel(ContainerPanel panel) {
        this.panel = panel;
    }

    public void remove() {
        panel.remove(this);
    }

    public Position getPosition() {
        return objectPosition;
    }
}
