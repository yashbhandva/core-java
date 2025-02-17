package advanceJava;

import java.awt.*;
import javax.swing.*;

class test{
    public void show(){
        JButton j = new JButton("click here...");
        j.setBounds(10,10,50,50);

        j.setVisible(true);

    }
}
public class JButtons {
    public static void main(String[] args) {
        test t = new test();
        t.show();
    }
}
