package advanceJava;

import javax.swing.*;
import java.awt.*;

public class jLabels {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("images.jpg");

        JLabel label = new JLabel();
        label.setText("uchiha itchi");
        label.setIcon(icon);


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setResizable(false);
        frame.add(label);
    }
}
