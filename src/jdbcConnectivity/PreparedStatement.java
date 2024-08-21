package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class preparedStatement {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,userName,password);
        PreparedStatement pst = con.prepareStatement("SELECT * FROM staff");
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        con.close();
    }
}
