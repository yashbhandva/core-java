package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insertMultipleRows {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,password,userName);
        Statement st = con.createStatement();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter id number : ");
            int id = sc.nextInt();
            System.out.print("enter name : ");
            String name = sc.next();
            System.out.print("enter subject : ");
            String subject = sc.next();
            String Query = String.format("INSERT INTO staff VALUES(%d,'%s','%s')",id,name,subject);
            st.executeUpdate(Query);
            System.out.print("do you want to insert one more row[yes/no] :");
            String x = sc.next();
            if (x.equalsIgnoreCase("no")){
                break;
            }
        }
        con.close();
    }
}
