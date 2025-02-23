package advanceJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Insert {

    public static void insert(String id,String name,String age) throws Exception {
        String url = "jdbc:mysql://localhost:3306/exam";
        String username = "root";
        String password = "root";
        String query = "insert into user values(?,?,?)";
        String driver = ("com.mysql.cj.jdbc.Driver");

        Class.forName(driver);

        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1,id);
        pst.setString(2,name);
        pst.setString(3,age);
        pst.executeUpdate();
    }

    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame("JDBC Demo");
        f.setLayout(null);
        f.setSize(420, 420);

        JLabel l1 = new JLabel("Enter Id : ");
        l1.setBounds(10, 20, 150, 50);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(10, 70, 150, 30);
        f.add(t1);

        JLabel l2 = new JLabel("Enter Name : ");
        l2.setBounds(10, 110, 150, 50);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(10, 150, 150, 30);
        f.add(t2);

        JLabel l3 = new JLabel("Enter Age : ");
        l3.setBounds(10, 190, 150, 50);
        f.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(10, 230, 150, 30);
        f.add(t3);


        JButton b = new JButton("Insert");
        b.setBounds(10,280,150,30);
        f.add(b);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String id = t1.getText();
                String name = t2.getText();
                String  age = t3.getText();

                try{
                    insert(id,name,age);
                }catch(Exception exception){}
            }
        });
        f.setVisible(true);
    }
}
