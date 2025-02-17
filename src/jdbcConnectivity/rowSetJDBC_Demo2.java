package jdbcConnectivity;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class rowSetJDBC_Demo2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        String insertQuery = "INSERT INTO college.staff VALUES(11,'dron','ved')";
        String selectQuery = "SELECT * FROM college.staff WHERE id = 11";  // Fetch the inserted data

        RowSetFactory factory = null;
        try {
            factory = RowSetProvider.newFactory();
            JdbcRowSet jd = factory.createJdbcRowSet();
            jd.setUrl(url);
            jd.setUsername(userName);
            jd.setPassword(password);

            // Execute the INSERT query
            jd.setCommand(insertQuery);
            jd.execute();
            System.out.println("Record inserted successfully.");

            // Now execute the SELECT query to fetch the result
            jd.setCommand(selectQuery);
            jd.execute();

            // Print the inserted data to confirm
            while (jd.next()) {
                System.out.println("ID: " + jd.getInt("id"));
                System.out.println("First Name: " + jd.getString("firstName"));
                System.out.println("Last Name: " + jd.getString("lastName"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
