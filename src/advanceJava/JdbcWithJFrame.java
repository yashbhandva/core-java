package advanceJava;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Objects;


public class JdbcWithJFrame {
	public static void main(String[] args) throws Exception{
		JFrame f = new JFrame("jdbc insert query");
		f.setSize(420,420);
		f.setLayout(null);
		
		JLabel name = new JLabel("Enter name : ");
		name.setBounds(10,20,150,50);
		f.add(name);
		
		JTextField t = new JTextField();
		t.setBounds(100,20,150,50);
		f.add(t);
		
		JButton b = new JButton("Insert");
		b.setBounds(50,100,150,50);
		f.add(b);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String n = t.getText();
				try{
					insert(n);
				}catch(Exception ex){}
			}
		});


        f.setVisible(true);
	}

	public static void insert(String n)throws Exception{
		String url = "jdbc:mysql://localhost:3306/college";
		String name = "root";
		String password = "root";	
		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection con = DriverManager.getConnection(url,name,password);
		PreparedStatement pst = con.prepareStatement("insert into tb values(?)");
		pst.setString(1,n);
		pst.executeUpdate();
    }
}
