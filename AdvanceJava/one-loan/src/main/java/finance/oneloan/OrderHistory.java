package finance.oneloan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderHistory {
	
	public void getOrderHistory() throws SQLException, ClassNotFoundException  {
		//register the class this is optional ---- dynamic class loading
		
		
			Class.forName( "com.mysql.cj.jdbc.Driver");
		
		
		//2. create connection
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice", "root", "AYUsh58627@#");
		
		
		// 3. create connection
		
		Statement smt = connection.createStatement();
		
		//4. execute query
		String query = "select * from bank_account ";
		
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String accountType = rs.getString(3);
			int balance = rs.getInt(4);
			String city = rs.getString(5);
			
			
			
			System.out.println("ID:- "+id);
			System.out.println("Name:- "+name);
			System.out.println("Account Type:- "+accountType);
			System.out.println("Balance:- "+balance);
			System.out.println("City:- "+city);
			System.out.println("++++++++++++++++++++++++++++");
		}
		
		
	}
}
