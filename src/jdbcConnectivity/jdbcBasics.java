package jdbcConnectivity;

import java.sql.*;

public class jdbcBasics {
    public static void main(String[] args) throws SQLException {
        System.out.println("id     || name     || marks");
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/college";
        String name = "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(url,name,password);
            st = con.createStatement();
            rs = st.executeQuery("select * from student where marks>70");

            while (rs.next()){
                System.out.println(rs.getInt(1)+"\t: "
                                   +rs.getString(2)+"\t: "
                                   +rs.getString(3));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (con!=null){
                con.close();
            }
            if (st!=null){
                st.close();
            }
            if (rs!=null){
                rs.close();
            }
        }
    }
}
