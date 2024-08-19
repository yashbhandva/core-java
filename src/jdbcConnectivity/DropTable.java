package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String password = "root";
        String userName = "root";
        String Query = "drop table staff";

        Connection con = null;
        Statement st = null;
        int rs;

        try {
            con = DriverManager.getConnection(url,userName,password);
            st = con.createStatement();
            rs = st.executeUpdate(Query);
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            if (con!=null){
                try {
                    con.close();
                }catch (SQLException e){

                }
            }
        }
        System.out.println("table is drop");
    }
}
