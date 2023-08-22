package com;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
public class MyConClass {
	public void MyConnection()  {
		System.out.println("I am in connection class");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);			
			String url = "jdbc:mysql://localhost:3306/my_jdbc";
			String UserName="root";
			String Password="root";			
			Connection conn = DriverManager.getConnection(url, UserName, Password);			
			Statement stmn = conn.createStatement();
			
			String myQuerry = "insert into mytable values ('4','Chiku','Tester', 45000);";
			stmn.executeUpdate(myQuerry);
			System.out.println("Querry executed succesfully");
			conn.close();
			
		}catch(Exception e) {
			System.out.println("Database exception==>"+e);
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConClass m = new  MyConClass();
		m.MyConnection();
	}
}


