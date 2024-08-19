package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertValues {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";
        String Query = "INSERT INTO college.staff VALUES ('30', 'chagan', 'ganit');";

        Connection con = null;
        Statement st = null;
        int rs;

        try {
            con = DriverManager.getConnection(url,password,userName);
            st = con.createStatement();
            rs = st.executeUpdate(Query);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }finally {
            if (con != null) {
                try {
                    con.close();
                }catch (SQLException sqlException){
                    System.out.println(sqlException.getMessage());
                }
            }
        }
        System.out.println("insertion successfully");
    }
}
