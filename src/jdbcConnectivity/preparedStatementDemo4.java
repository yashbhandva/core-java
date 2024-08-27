package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparedStatementDemo4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";
        String Query = "INSERT INTO college.student VALUES (?,?,?)";

        Connection con = null;
        PreparedStatement pst = null;
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                con = DriverManager.getConnection(url,userName,password);
                pst = con.prepareStatement(Query);

                System.out.print("enter id number : ");
                int id = sc.nextInt();
                System.out.print("enter name : ");
                String name = sc.next();
                System.out.print("enter marks : ");
                int marks = sc.nextInt();

                pst.setInt(1,id);
                pst.setString(2,name);
                pst.setInt(3,marks);

                pst.executeUpdate();
            }catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }finally {
                try {
                    if (con!=null){
                        con.close();
                    }
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
                try {
                    if (pst!=null){
                        pst.close();
                    }
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("do you want to enter one more row [yes/no] : ");
            String option = sc.next();
            if (option.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
