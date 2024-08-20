package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class blankSpace {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        boolean flag = false;
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM staff WHERE id>11");
        while (rs.next()){
            flag = true;
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        if (flag==false){
            System.out.println("no matched record found...");
        }
        con.close();
    }
}
