package jdbcConnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProceduresApplication_2 {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,userName,password);
        CallableStatement cst = con.prepareCall("{call p2(?,?)}");
        cst.setInt(1,4);
        cst.registerOutParameter(2, Types.INTEGER);
        cst.execute();
        int result = cst.getInt(2);
        System.out.println(result);
    }
}
