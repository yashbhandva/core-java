package advanceJava;

import javax.swing.*;
import java.awt.*;

public class JFrames {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(420,420);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setTitle("uchiha Itachi");
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.cyan);
    }
}
