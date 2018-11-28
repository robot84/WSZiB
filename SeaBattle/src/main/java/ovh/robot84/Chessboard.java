package ovh.robot84;

import javax.swing.*;
import java.awt.*;

public class Chessboard extends JPanel {
    private int verticalFields = 10;
    private int horizontallyFields = 10;

    public Chessboard() {
        super();
//            this.addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    super.mouseClicked(e);
//                    JOptionPane.showMessageDialog(null,"Hello");
//                }
//            });
//            // set a preferred size for the custom panel.
        //this.setVisible(true);
        // setPreferredSize(new Dimension(420,420));

        this.setPreferredSize(new Dimension(200, 200));
        //this.setPreferredSize(new Dimension(300,300));
        this.setVisible(true);
        this.print();
    }

    void print() {
        System.out.println("Jestem Chessboard");
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        System.out.println("Jestem chessboard i robie paintComponent()");
        g.drawString("BLAH", 20, 20);
        this.drawChessboard(10, 10, 10, 10, 30, g);
    }


    void drawChessboard(int howManyFieldsHorizontally, int howManyFieldsVertical,
                        int x, int y, int fieldSizeInPx, Graphics g) {

        for (int i = 0; i < howManyFieldsVertical; i++)
            this.drawLineOfRects(howManyFieldsHorizontally, x, y + i * fieldSizeInPx, fieldSizeInPx, g);
    }


    void drawLineOfRects(int howMany, int x, int y, int fieldSizeInPx, Graphics g) {

        for (int i = 0; i < howMany; i++) {
            g.drawRect(x + fieldSizeInPx * i, y, fieldSizeInPx, fieldSizeInPx);
        }
    }

}
