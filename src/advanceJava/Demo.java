package advanceJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Demo {
    
public static void insert(String name) throws Exception{
	String url = "jdbc:mysql://localhost:3306/college";
	String username = "root";
	String pass = "root";
	String driver = "com.mysql.cj.jdbc.Driver";

	Class.forName(driver);
	Connection con = DriverManager.getConnection(url,username,pass);
	PreparedStatement pst = con.prepareStatement("insert into tb values(?)");
	pst.setString(1,name);
	pst.executeUpdate();
}
    public static void main(String[] args) throws Exception{
        JFrame f = new JFrame("jdbc basics ");
        f.setSize(420,420);
        f.setLayout(null);

        JLabel l = new JLabel("enter name : ");
        l.setBounds(10,20,150,50);
        f.add(l);

	JTextField t = new JTextField();
	t.setBounds(100,20,150,50);
	f.add(t);

	JButton b = new JButton("Insert");
	b.setBounds(75,75,150,50);
	f.add(b);
	
	b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
		String name = t.getText();
		try{
			insert(name);
		}catch(Exception ex){}
        }
    });
        f.setVisible(true);
    }
}

