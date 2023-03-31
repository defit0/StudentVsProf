package StudentenVsDozenten.gui;

import StudentenVsDozenten.Hilfsklasse.Position;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

import javax.swing.*;

public class MapObject {
    ImageIcon objectIcon = new ImageIcon();
    JLabel objectLabel = new JLabel();
    public Position objectPosition;
    boolean isVisible = true;
    ContainerPanel panel;
    boolean backgraund = false;
    Visible myObject;

    public MapObject(URL imageIcon, Position p, ContainerPanel panel, Visible visible) {
        myObject = visible;
        this.panel = panel;
        this.panel.add(this);
        this.objectPosition = p;
        objectLabel.setBounds(Math.round(objectPosition.getxPosition()), Math.round(objectPosition.getyPosition()), Math.round(objectPosition.getLength()), Math.round(objectPosition.getHeight()));
        ImageIcon preLodetIcon = new ImageIcon(imageIcon);
        Image img = preLodetIcon.getImage();
        Image scaledImg = img.getScaledInstance(objectLabel.getWidth(), objectLabel.getHeight(), Image.SCALE_SMOOTH);
        objectIcon = new ImageIcon(scaledImg);
        objectLabel.setIcon(objectIcon);
        objectLabel.setVisible(true);
        this.panel.add(objectLabel);
        panel.setComponentZOrder(objectLabel, 0);
        objectLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getClicked();
                System.out.println("Label clicked");
            }
        });
        this.panel.revalidate();
        this.panel.repaint();

    }

    public MapObject(URL imageIcon, Position p, ContainerPanel panel, boolean background, Visible visible) {
        myObject = visible;
        this.panel = panel;
        this.panel.add(this);
        this.objectPosition = p;
        objectLabel.setBounds(Math.round(objectPosition.getxPosition()), Math.round(objectPosition.getyPosition()), Math.round(objectPosition.getLength()), Math.round(objectPosition.getHeight()));
        ImageIcon preLodetIcon = new ImageIcon(imageIcon);
        Image img = preLodetIcon.getImage();
        Image scaledImg = img.getScaledInstance(objectLabel.getWidth(), objectLabel.getHeight(), Image.SCALE_SMOOTH);
        objectIcon = new ImageIcon(scaledImg);
        objectLabel.setIcon(objectIcon);
        objectLabel.setVisible(true);
        if (background) {
        }
        this.panel.add(objectLabel);
        objectLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getClicked();
                System.out.println("Label clicked");
            }
        });
        this.panel.revalidate();
        this.panel.repaint();
    }


    public MapObject(String imageIcon, Position p, ContainerPanel panel, Visible visible) {
        myObject = visible;
        this.panel = panel;
        this.panel.add(this);
        this.objectPosition = p;
        objectLabel.setBounds(Math.round(objectPosition.getxPosition()), Math.round(objectPosition.getyPosition()), Math.round(objectPosition.getLength()), Math.round(objectPosition.getHeight()));
        ImageIcon preLodetIcon = new ImageIcon(imageIcon);
        Image img = preLodetIcon.getImage();
        Image scaledImg = img.getScaledInstance(objectLabel.getWidth(), objectLabel.getHeight(), Image.SCALE_SMOOTH);
        objectIcon = new ImageIcon(scaledImg);
        objectLabel.setIcon(objectIcon);
        objectLabel.setVisible(true);
        this.panel.add(objectLabel);
        panel.setComponentZOrder(objectLabel, 0);
        objectLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getClicked();
                System.out.println("Label clicked");
            }
        });
        this.panel.revalidate();
        this.panel.repaint();
    }


    public ContainerPanel getPanel() {
        return panel;
    }

    public void setPanel(ContainerPanel panel) {
        this.panel = panel;
    }

    private void getClicked() {
        myObject.getClicked();
    }

    public void remove() {
        panel.remove(objectLabel);
        panel.remove(this);
    }

    public Position getPosition() {
        return objectPosition;
    }

    public JLabel getLabel() {
        return objectLabel;
    }

    public Position getObjectPosition() {
        return objectPosition;
    }

    public void setObjectPosition(Position objectPosition) {
        this.objectPosition = objectPosition;
        objectLabel.setLocation(Math.round(objectPosition.getxPosition()), Math.round(objectPosition.getyPosition()));
        panel.repaint();

    }

    public void setObjectNewImag(URL url) {
        ImageIcon preLodetIcon = new ImageIcon(url);
        Image img = preLodetIcon.getImage();
        Image scaledImg = img.getScaledInstance(objectLabel.getWidth(), objectLabel.getHeight(), Image.SCALE_SMOOTH);
        objectIcon = new ImageIcon(scaledImg);

        objectLabel.setIcon(objectIcon);
        panel.repaint();
    }
}