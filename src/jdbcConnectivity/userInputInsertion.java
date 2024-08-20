package jdbcConnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class userInputInsertion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter id number : ");
        int id = sc.nextInt();
        System.out.print("enter staff name : ");
        String name = sc.next();
        System.out.print("enter subject : ");
        String subject = sc.next();

        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = null;
        Statement st = null;
        String query = String.format("INSERT INTO college.staff VALUES(%d,'%s','%s')",id,name,subject);
        int rs;

        con = DriverManager.getConnection(url,password,userName);
        st = con.createStatement();
        rs = st.executeUpdate(query);
        con.close();
        st.close();
    }
}
