package ovh.robot84;

import javax.swing.*;
import java.io.IOException;

public class MainForm {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private Chessboard chessboard1;
    private Chessboard chessboard2;
    private JLabel leftAxeLabels;
    private JFrame jFrame;
    private Board board2;

//    public MainWindow() {
//
////        MainWindowMainPanel.addMouseListener(new MouseAdapter() {
////            @Override
////            public void mouseClicked(MouseEvent e) {
////                super.mouseClicked(e);
////                JOptionPane.showMessageDialog(null,"Hello");
////            }
////        });
//    }


    MainForm() throws IOException {
        jFrame = new JFrame("MainWindow");
        jFrame.setContentPane(mainPanel);
        jFrame.setBounds(400, 400, 1400, 600);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.pack();
        jFrame.setVisible(true);
        chessboard1.updateField(1, 1, Chessboard.FieldState.VIRGIN);
        chessboard1.updateField(2, 2, Chessboard.FieldState.SHIP_CRUISING);
        chessboard1.updateField(3, 3, Chessboard.FieldState.SHIP_SANK);
    }

    public static void main(String[] args) {
        //MainWindow mainWindow=new MainWindow();

        //MainWindow mainWindow=new MainWindow();

    }

}
