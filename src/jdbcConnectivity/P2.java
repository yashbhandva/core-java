package jdbcConnectivity;

import java.sql.*;
import java.util.Scanner;

class P2{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your email : ");
		String email = sc.nextLine();

		System.out.println("enter your password : ");
		String pass = sc.nextLine();

		System.out.println("enter your id : ");
		int id = sc.nextInt();

		String url = "jdbc:mysql://localhost/college";
		String name = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,name,password);

		//insert query
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?)");
		ps.setString(1,email);
		ps.setString(2,pass);
		ps.setInt(3,id);
		int count = ps.executeUpdate();
		if(count > 0){
			System.out.println("value inserted successflly");
		}
		else{
			System.out.println("something went wrong while add new user");
		}

		//select query
		PreparedStatement pst = con.prepareStatement("select * from user");

		ResultSet rs = pst.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
	}
}