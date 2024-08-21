package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preparedStatementUpdate{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";
        String query = "INSERT INTO staff VALUES(6, 'karan', 'PT')";

        Connection con = DriverManager.getConnection(url,userName,password);
        PreparedStatement pst = con.prepareStatement(query);
        pst.executeUpdate();
    }
}
