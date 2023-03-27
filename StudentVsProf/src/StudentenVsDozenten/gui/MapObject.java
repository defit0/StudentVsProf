package StudentenVsDozenten.gui;

import StudentenVsDozenten.Hilfsklasse.Position;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Label;
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

    public MapObject(URL imageIcon, Position p,ContainerPanel panel) {
    	this.panel = panel;
    	this.panel.add(this);
    	objectLabel.setOpaque(true);
    	this.objectPosition = p;
    	objectLabel.setBounds(Math.round(objectPosition.getxPosition()), Math.round(objectPosition.getyPosition()),Math.round(objectPosition.getLength()), Math.round(objectPosition.getHeight()));
    	ImageIcon preLodetIcon = new ImageIcon(imageIcon);
        Image img = preLodetIcon.getImage();
        Image scaledImg = img.getScaledInstance(objectLabel.getWidth(), objectLabel.getHeight(), Image.SCALE_SMOOTH);
        objectIcon = new ImageIcon(scaledImg);
        objectLabel.setIcon(objectIcon);
        objectLabel.setVisible(true);
        this.panel.add(objectLabel);
        panel.setComponentZOrder(objectLabel, 1);
        this.panel.revalidate();
        this.panel.repaint();
 
    }
    
    public MapObject(URL imageIcon, Position p,ContainerPanel panel,boolean backgraund) {
    	this.panel = panel;
    	this.panel.add(this);
    	objectLabel.setOpaque(true);
    	this.objectPosition = p;
    	objectLabel.setBounds(Math.round(objectPosition.getxPosition()), Math.round(objectPosition.getyPosition()),Math.round(objectPosition.getLength()), Math.round(objectPosition.getHeight()));
    	ImageIcon preLodetIcon = new ImageIcon(imageIcon);
        Image img = preLodetIcon.getImage();
        Image scaledImg = img.getScaledInstance(objectLabel.getWidth(), objectLabel.getHeight(), Image.SCALE_SMOOTH);
        objectIcon = new ImageIcon(scaledImg);
        objectLabel.setIcon(objectIcon);
        objectLabel.setVisible(true);
        if(backgraund) {
        	
        }
        
        this.panel.add(objectLabel);
        this.panel.revalidate();
        this.panel.repaint();
 
    }

    

	public ContainerPanel getPanel() {
        return panel;
    }
    public void setPanel(ContainerPanel panel) {
        this.panel = panel;
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
}
