package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class dropMultipleTable {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, password, userName);
        Statement st = con.createStatement();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter table name which is you want to drop : ");
        String Drop = sc.next();
        String Query = String.format("DROP TABLE `%s`",Drop);
        int DropCount = st.executeUpdate(Query);
        System.out.println("table "+Drop+" was deleted successfully");
        System.out.println(DropCount);
        con.close();
    }
}
