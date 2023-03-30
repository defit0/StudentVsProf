package StudentenVsDozenten.gui;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public static ContainerPanel spielfeld;
    public static ContainerPanel seitenmenue;
    private int width = 815; // Magic Number, an Groeße von Fliesen angepasst
    private int height = 700;

    public GameFrame() {
        this.setTitle("Studenten vs. Dozenten");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(width, height));
        this.setResizable(false);
        this.setSize(width, height);
        //this.setLayout(new BorderLayout());
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void addContainerPanel(ContainerPanel panel) {
        this.add(panel);
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}