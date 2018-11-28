package ovh.robot84;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    private JPanel panelSzachowy;
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
