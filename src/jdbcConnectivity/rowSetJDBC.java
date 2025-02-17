package jdbcConnectivity;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class rowSetJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";
        String Query = "SELECT * FROM college.staff";

        RowSetFactory factory = null;
        try {
            factory = RowSetProvider.newFactory();
            JdbcRowSet jdbcRowSet = factory.createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(userName);
            jdbcRowSet.setPassword(password);
            jdbcRowSet.setCommand(Query);
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                System.out.println(jdbcRowSet.getInt(1) + "\t" + jdbcRowSet.getString(2) + "\t" + jdbcRowSet.getString(3));
            }
            System.out.println();
            while (jdbcRowSet.previous()){
                System.out.println(jdbcRowSet.getInt(1) + "\t" + jdbcRowSet.getString(2) + "\t" + jdbcRowSet.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
