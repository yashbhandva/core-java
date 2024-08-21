package jdbcConnectivity;

import java.sql.*;

public class executeMethod {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        //boolean b = st.execute("INSERT INTO staff VALUES(2,'vijay','ganit')");
        boolean b = st.execute("SELECT * FROM staff");
        if (b==true) {
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
            }
        }
        else {
            int updateCount = st.getUpdateCount();
            System.out.println(updateCount);
        }
    }
}
