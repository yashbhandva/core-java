package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class createMultipleTable {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, password, userName);
        Statement st = con.createStatement();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter table name which is you want to create : ");
        String create = sc.next();
        String Query = String.format("CREATE TABLE `%S` (name varchar(10))",create);

        st.executeUpdate(Query);
        System.out.println("table "+create+" was created ");
        con.close();
    }
}
