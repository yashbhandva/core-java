package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMultipleRows {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,password,userName);
        Statement st = con.createStatement();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter id which is you want to remove : ");
        float delete = sc.nextFloat();
        String Query = String.format("DELETE FROM staff WHERE id>%f",delete);
        st.executeUpdate(Query);
        con.close();
    }
}
