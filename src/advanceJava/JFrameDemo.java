package advanceJava;
import javax.swing.*;

public class JFrameDemo {
	public static void main(String[] args){
		JFrame f = new JFrame("demo frame");
		f.setSize(420,420);
		f.setLayout(null);

		JButton b = new JButton("click me");
		b.setBounds(50,20,150,50);
		f.add(b);

		JLabel l = new JLabel("click me..");
		l.setBounds(50,70,150,50);
		f.add(l);

        f.setVisible(true);
	}
}
