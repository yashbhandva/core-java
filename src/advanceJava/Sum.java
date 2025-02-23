package advanceJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum {
    public static void main(String[] args) {
        JFrame f = new JFrame("delete");
        f.setSize(420,420);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter num 1 : ");
        l1.setBounds(10,20,150,30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(10,50,150,30);
        f.add(t1);

        JLabel l2 = new JLabel("Enter num 2 : ");
        l2.setBounds(10,80,150,30);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(10,120,150,30);
        f.add(t2);

        JButton b = new JButton("add");
        b.setBounds(10,160,150,30);
        f.add(b);

        JLabel sum = new JLabel("ans : ");
        sum.setBounds(10,200,150,30);
        f.add(sum);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int x = n1+n2;
                sum.setText("ans : "+x);

            }
        });
        f.setVisible(true);
    }
}
