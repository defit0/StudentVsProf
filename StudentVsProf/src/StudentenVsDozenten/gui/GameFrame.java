package StudentenVsDozenten.gui;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public static ContainerPanel spielfeld;
    public static ContainerPanel seitenmenue;
    private int width = 1280;
    private int height = 720;

    public GameFrame() {
        this.setTitle("Studenten vs. Dozenten");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1280, 720));
        this.setResizable(true);
        this.setSize(width, height);
        //this.setLayout(new BorderLayout());
        this.setLayout(null);
        this.setVisible(true);
    }

    public void addContainerPanel(ContainerPanel panel) {
        this.add(panel);
    }
    public void addSouthContainerPanel(ContainerPanel panel) {
        this.add(panel, BorderLayout.SOUTH);
    }
    public void setResolution(int width, int height) {
        this.width = width;
        this.height = height;
        this.setSize(width, height);
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}