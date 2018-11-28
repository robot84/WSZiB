package ovh.robot84;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Chessboard extends JPanel {
    private int verticalFields = 10;
    private int horizontallyFields = 10;
    private int fieldSizeInPx = 30;

    public enum FieldState {
        VIRGIN, MISSED, SHIP_CRUISING, SHIP_SANK
    }


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
        this.setVisible(true);
        this.print();
    }


    void setFieldSizeInPx(int fieldSizeInPx) {
        this.fieldSizeInPx = fieldSizeInPx;
    }


    /**
     *
     */
    void print() {
        System.out.println("Jestem Chessboard");
    }


    /**
     * @param x
     * @return
     */
    int getonScreenCoordinateX(int x) {
        return x * fieldSizeInPx;
    }


    /**
     * @param y
     * @return
     */
    int getonScreenCoordinateY(int y) {
        return y * fieldSizeInPx;
    }


    /**
     * Change image on a field regarding it state
     *
     * @param x     - x coordinate of board (value range from 1 to 10 inclusive)
     * @param y     - y coordinate of board (value range from 1 to 10 inclusive)
     * @param state - one of the cases: "shipCrusing", "shipSank", "water","missed"
     */
    void updateField(int x, int y, FieldState state) throws IOException {


        final BufferedImage VIRGINimg;
        final BufferedImage SHIP_CRUISINGimg;
        final BufferedImage SHIP_SANKimg;
        final BufferedImage MISSEDimg;

        VIRGINimg = ImageIO.read(new File("C:\\Users\\qtcj47\\IdeaProjects\\WSZiB\\SeaBattle\\src\\main\\resources\\png\\001-wave.png"));
        SHIP_CRUISINGimg = ImageIO.read(new File("C:\\Users\\qtcj47\\IdeaProjects\\WSZiB\\SeaBattle\\src\\main\\resources\\png\\012-yacht.png"));
        SHIP_SANKimg = ImageIO.read(new File("C:\\Users\\qtcj47\\IdeaProjects\\WSZiB\\SeaBattle\\src\\main\\resources\\png\\002-beach.png"));
        MISSEDimg = ImageIO.read(new File("C:\\Users\\qtcj47\\IdeaProjects\\WSZiB\\SeaBattle\\src\\main\\resources\\png\\011-boat-1.png"));


        switch (state) {
            case VIRGIN:
                this.drawInField(x, y, VIRGINimg);
                break;
            case SHIP_CRUISING:
                this.drawInField(x, y, SHIP_CRUISINGimg);
                break;
            case SHIP_SANK:
                this.drawInField(x, y, SHIP_SANKimg);
                break;
            case MISSED:
                this.drawInField(x, y, MISSEDimg);
                break;
        }
        //getFieldSize();
        // switch(state) ... g.drawImage(getonScreenCoordinateX(x),getonScreenCoordinateY(y),...)

    }


    /**
     * @param x
     * @param y
     * @param image
     */
    void drawInField(int x, int y, Image image) {
        this.getGraphics().drawImage(image, this.getonScreenCoordinateX(x), this.getonScreenCoordinateY(y), this.fieldSizeInPx, this.fieldSizeInPx, null);
    }


    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        System.out.println("Jestem chessboard i robie paintComponent()");
        this.drawChessboard(10, 10, 0, 0, g);
    }


    /**
     * Draw a chessboard (matrix of squares)
     * @param howManyFieldsHorizontally - number of fields horizontally to draw
     * @param howManyFieldsVertical - number of fields vertical to draw
     * @param x - the x coordinate of left upper corner
     * @param y - the y coordinate of left upper corner
     * @param fieldSizeInPx - number of pixels in height/width of one field
     * @param g - graphics
     */
    void drawChessboard(int howManyFieldsHorizontally, int howManyFieldsVertical,
                        int x, int y, Graphics g) {

        for (int i = 0; i < howManyFieldsVertical; i++)
            this.drawLineOfRects(howManyFieldsHorizontally, x, y + i * this.fieldSizeInPx, g);
    }


    /**
     * @param howMany
     * @param x
     * @param y
     * @param fieldSizeInPx
     * @param g
     */
    void drawLineOfRects(int howMany, int x, int y, Graphics g) {

        for (int i = 0; i < howMany; i++) {
            g.drawRect(x + fieldSizeInPx * i, y, this.fieldSizeInPx, this.fieldSizeInPx);
        }
    }

}
