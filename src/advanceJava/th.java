package advanceJava;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class th{

    public static void insert(int id,String name,int age) throws Exception{
        String url = "jdbc:mysql://localhost:3306/exam";
        String user = "root";
        String pass = "root";
        String query = "insert into user values(?,?,?)";
        String driver = "com.mysql.cj.jdbc.Driver";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,user,pass);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setInt(3,age);

        int count = pst.executeUpdate();
        if(count > 0){
            System.out.println("Done.");
        }
    }
    public static void main(String[] args) throws Exception{
        JFrame f = new JFrame("demo ");
        f.setLayout(null);
        f.setSize(420,420);

        JLabel l1 = new JLabel("enter id : ");
        l1.setBounds(10,10,150,30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(10,50,150,30);
        f.add(t1);

        JLabel l2 = new JLabel("enter name : ");
        l2.setBounds(10,100,150,30);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(10,150,150,30);
        f.add(t2);

        JLabel l3 = new JLabel("enter age : ");
        l3.setBounds(10,200,150,30);
        f.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(10,250,150,30);
        f.add(t3);

        JButton b = new JButton("insert");
        b.setBounds(10,300,150,30);
        f.add(b);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int id = Integer.parseInt(t1.getText());
                String name = t2.getText();
                int age = Integer.parseInt(t3.getText());

                try{
                    insert(id,name,age);
                }catch(Exception ez){}
            }
        });
        f.setVisible(true);
    }
}
