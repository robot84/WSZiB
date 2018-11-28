package ovh.robot84;

import java.io.IOException;

public class GUITest {
    public static void main(String[] args) {
        try {
            MainForm mainForm = new MainForm();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hello Swing!");
    }
}
