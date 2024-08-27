package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedStatementDemo3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";
        String Query = "DELETE FROM staff WHERE id > ?";

        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = DriverManager.getConnection(url,userName,password);
            pst = con.prepareStatement(Query);
            pst.setInt(1,10);
            int updateCount = pst.getUpdateCount();
            System.out.println(updateCount);
            pst.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (con!=null){
                try {
                    con.close();
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
            if (pst!=null){
                try {
                    pst.close();
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
