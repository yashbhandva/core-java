package jdbcConnectivity;

import java.sql.*;

public class createTable {
    public static void main(String[] args) throws SQLException{
        Connection con = null;
        Statement st = null;
        int rs;
        String  Query = "create table staff(id int(15)primary key,name varchar(10),subject varchar(10))";

        String url = "jdbc:mysql://localhost:3306/college";
        String name = "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(url, name, password);
            st = con.createStatement();
            rs = st.executeUpdate(Query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (con!=null){
                con.close();
            }
        }
        System.out.println("table created");
    }
}
