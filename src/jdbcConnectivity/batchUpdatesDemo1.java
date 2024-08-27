package jdbcConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class batchUpdatesDemo1 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                con = DriverManager.getConnection(url,userName,password);
                st = con.createStatement();
                System.out.print("enter id number : ");
                int id = sc.nextInt();
                System.out.print("enter name : ");
                String name = sc.next();
                System.out.print("enter subject : ");
                String subject = sc.next();

                String Query = String.format("INSERT INTO staff VALUES(%d,'%s','%s')",id,name,subject);
                int updateCount= st.executeUpdate(Query);
                System.out.println(updateCount);
                st.addBatch(Query);

                int[] arr = st.executeBatch();
                for (int a :arr){
                    if (a==0){
                        System.out.println("Query "+a+" not executed !!");
                    }
                    else {
                        System.out.println("Query "+a+" executed.");
                    }
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                if (con!=null){
                    try {
                        con.close();
                    }catch (SQLException exception){
                        System.out.println(exception.getMessage());
                    }
                }
            }
            System.out.print("do you want to add one more query[yes/no]");
            String option = sc.next();
            if (option.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
