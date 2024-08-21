package jdbcConnectivity;

import com.mysql.cj.Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class insertMultipleQueryByPreparedStatement {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, password, userName);

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("enter id number : ");
            int id = sc.nextInt();
            System.out.print("enter name : ");
            String name = sc.next();
            System.out.print("enter subject : ");
            String subject = sc.next();
            String Query = String.format("INSERT INTO staff values(%d,'%s','%s')",id,name,subject);
            PreparedStatement pst = con.prepareStatement(Query);
            pst.executeUpdate();

            System.out.println("insertion successfully");
            System.out.print("do want to one more query[yes/no] : ");
            String option = sc.next();

            if (option.equalsIgnoreCase("no")){
                break;
            }
        }
        con.close();
    }
}
