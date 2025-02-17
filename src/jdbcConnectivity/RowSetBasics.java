package jdbcConnectivity;

import javax.sql.rowset.*;

public class RowSetBasics {
    public static void main(String[] args) {
        RowSetFactory factory;
        try {
            factory = RowSetProvider.newFactory();
            JdbcRowSet jdbcRowSet = factory.createJdbcRowSet();
            WebRowSet webRowSet = factory.createWebRowSet();
            CachedRowSet cachedRowSet = factory.createCachedRowSet();
            FilteredRowSet filteredRowSet = factory.createFilteredRowSet();

            System.out.println(jdbcRowSet.getClass().getName());
            System.out.println(webRowSet.getClass().getName());
            System.out.println(cachedRowSet.getClass().getName());
            System.out.println(filteredRowSet.getClass().getName());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
