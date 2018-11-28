package ovh.robot84;

import javax.swing.*;

public class MainForm {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private Chessboard chessboard1;
    private Chessboard chessboard2;
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


    MainForm() {
        jFrame = new JFrame("MainWindow");
        jFrame.setContentPane(mainPanel);
        jFrame.setBounds(400, 400, 1000, 600);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        //MainWindow mainWindow=new MainWindow();

        //MainWindow mainWindow=new MainWindow();

    }

}
