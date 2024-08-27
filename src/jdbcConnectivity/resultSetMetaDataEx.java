package jdbcConnectivity;

import java.sql.*;

public class resultSetMetaDataEx {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "root";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ResultSetMetaData ms;

        try {
            con = DriverManager.getConnection(url,userName,password);
            pst = con.prepareStatement("SELECT * FROM college.staff");
            rs = pst.executeQuery();
            ms = rs.getMetaData();
            System.out.println(ms.getColumnName(1)+" : "+ms.getColumnName(2)+"  :  "+ms.getColumnName(3));
            while (rs.next()){
                int x = rs.getInt(1);
                String y = rs.getString(2);
                String z = rs.getString(3);
                System.out.println(x+" : "+y+" : "+z);
            }
            System.out.println();
            System.out.println(ms.getColumnCount());
            System.out.println(ms.getCatalogName(1)+" : "+ms.getCatalogName(2)+" : "+ms.getCatalogName(3));
            System.out.println(ms.getColumnLabel(1)+" : "+ms.getColumnLabel(2)+" : "+ms.getColumnLabel(3));
            System.out.println(ms.getColumnDisplaySize(1)+" : "+ms.getColumnDisplaySize(2)+" : "+ms.getColumnDisplaySize(3));
            System.out.println(ms.equals(2));
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }finally {
            try {
                if (con!=null){
                    con.close();
                }
            }catch (SQLException s){
                System.out.println(s.getMessage());
            }
            try {
                if (pst!=null){
                    pst.close();
                }
            }catch (SQLException s){
                System.out.println(s.getMessage());
            }
            try {
                if (rs!=null){
                    rs.close();
                }
            }catch (SQLException s){
                System.out.println(s.getMessage());
            }
        }
    }
}
