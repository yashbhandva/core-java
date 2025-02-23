package advanceJava;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class delete {

public static void del(String id) throws Exception {
	String url = "jdbc:mysql://localhost:3306/exam";
	String username = "root";
	String password = "root";
	String query = "DELETE FROM user WHERE id = ?";  

	String driver = ("com.mysql.cj.jdbc.Driver");
	
	Class.forName(driver);

	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1,id);
	pst.executeUpdate();
}
	public static void main(String[] args){
		JFrame f = new JFrame("delete");
		f.setSize(420,420);
		f.setLayout(null);

		JLabel l = new JLabel("Enter id : ");
		l.setBounds(10,20,150,30);
		f.add(l);

		JTextField t = new JTextField();
		t.setBounds(80,20,150,30);
		f.add(t);

		JButton b = new JButton("delete");
		b.setBounds(10,70,150,30);
		f.add(b);

		b.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) {
				String id = t.getText();
				try{
					del(id);
				}catch(Exception ex){}
            		}
        });
		f.setVisible(true);
	}
}
