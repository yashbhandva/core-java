package jdbcConnectivity;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BLOB_Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String name = "root";
        String password = "root";
        String Query = "INSERT INTO college.parsons VALUES(?,?)";

        Connection con = null;
        PreparedStatement pst = null;
        FileInputStream fis;
        try {
            fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\xyz\\file\\itachi.jpg");
            con = DriverManager.getConnection(url,name,password);
            pst = con.prepareStatement(Query);
            pst.setString(1,"yash");
            pst.setBinaryStream(2,fis);
            pst.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            if (con!=null){
                try {
                    con.close();
                }catch (SQLException sqlException){
                    System.out.println(sqlException.getMessage());
                }
            }
            if (pst!=null){
                try {
                    pst.close();
                }catch (SQLException sqlException){
                    System.out.println(sqlException.getMessage());
                }
            }
        }
        System.out.println("done.");
    }
}
