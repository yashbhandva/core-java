package jdbcConnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class preparedStatementDemo2 {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";
        String Query = "SELECT * FROM staff WHERE name = ?";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(url,userName,password);
            pst = con.prepareStatement(Query);
            pst.setString(1,"shyam");
            rs = pst.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String subject = rs.getString("subject");

                System.out.println(id+"\t"+name+"\t"+subject);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (con!=null){
                con.close();
            }
            if (pst!=null){
                pst.close();
            }
            if (rs!=null){
                rs.close();
            }
        }
    }
}
