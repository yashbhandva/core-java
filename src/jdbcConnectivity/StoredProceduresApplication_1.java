package jdbcConnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProceduresApplication_1 {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url,userName,password);
        CallableStatement cst = con.prepareCall("{call p1(?,?,?)}");
        cst.setInt(1,100);
        cst.setInt(2,200);
        cst.registerOutParameter(3, Types.INTEGER);
        cst.execute();
        int result = cst.getInt(3);
        System.out.println(result);
    }
}
