package ovh.robot84;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Board extends JPanel {
    //TODO zastosowano nowatorskie nadpisanie metody klasy JPanel() bez potrzeby tworzenia osobnej klasy dla tak nadpisanej motedy :) patrz i ucz sie :)
    private JPanel panelSzachowy = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            BufferedImage image = null;
            try {
                image = ImageIO.read(new File("C:\\Projects\\MavenSandbox\\src\\main\\resources\\img.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(image, 0, 0, null);
        }
    };
    private int verticalFields = 5;
    private int horizontallyFields = 5;

    Board() {
        this.setPreferredSize(new Dimension(300, 300));
        this.setVisible(true);
        //this.setMaximumSize(new Dimension(300,300));
        //this.setVisible(false);
        //panelSzachowy.paintComponents
        System.out.println("Constructor Board");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("Board paintComponent()");
        g.drawString("BLAHA DRUGA", 0, 0);

        g.drawRect(10, 0, 30, 30);
    }
}
