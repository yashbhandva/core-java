package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class DatabaseMetaDataEx {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url,userName,password);
            DatabaseMetaData db = con.getMetaData();
            System.out.println(db.getDatabaseProductName());
            System.out.println(db.getDatabaseProductVersion());
            System.out.println(db.getConnection());
            System.out.println(db.getMaxColumnsInIndex());
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            if (con!=null){
                try {
                    con.close();
                }catch (SQLException s){
                    System.out.println(s.getMessage());
                }
            }
        }
    }
}
