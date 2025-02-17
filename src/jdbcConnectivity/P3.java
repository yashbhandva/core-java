package jdbcConnectivity;
import java.sql.*;

public class P3 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/college";
		String name = "root";
		String pass = "root";
		String driver = "com.mysql.cj.jdbc.Driver";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,name,pass);
		PreparedStatement pst = con.prepareStatement("select * from user");
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
	}
}
