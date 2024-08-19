package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";
        String Query = "create database xyz";

        Connection con = null;
        Statement st = null;
        int rs;

        try {
            con = DriverManager.getConnection(url,userName,password);
            st = con.createStatement();
            rs = st.executeUpdate(Query);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (con!=null){
                try {
                    con.close();
                }catch (SQLException sqlException){
                    System.out.println(sqlException.getMessage());
                }
            }
        }
        System.out.println("database creation successfully");
    }
}
