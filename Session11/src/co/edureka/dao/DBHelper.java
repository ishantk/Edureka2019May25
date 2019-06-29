package co.edureka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.edureka.model.User;

public class DBHelper {

	// API to create Connection with DB
	Connection con;
	
	// API to execute SQL Statement 
	PreparedStatement pStmt;
	
	// 1. Load the Driver
	public DBHelper(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
		}catch(Exception e){
			System.out.println(">> Some Exception "+e);
		}
	}
	
	// 2. Create Connection with DataBase
	public void createConnection(){
		try{
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka"; // jdbc:mysql://localhost -> Provided by DB vendor for local DB installation
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created");
		}catch(Exception e){
			System.out.println(">> Some Exception "+e);
		}
	}
	
	public int registerUser(User user){ // Take Input as Customer Object's Reference
		int i = 0;
		try {
			// 3. Write SQL Statement
	 		String sql = "insert into User values(null, ?, ?, ?)";
			
	 		// 4. Execute SQL Statement
	 		pStmt = con.prepareStatement(sql);
	 		pStmt.setString(1, user.name);
	 		pStmt.setString(2, user.email);
	 		pStmt.setString(3, user.password);
	 		
	 		i = pStmt.executeUpdate(); 	  
	 		
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
		
		return i;
	}
	
	public boolean loginUser(User user){ // Take Input as Customer Object's Reference
		
		boolean login = false;
		
		try {
			// 3. Write SQL Statement
	 		String sql = "select * from User where email = ? and password = ?";
			
	 		// 4. Execute SQL Statement
	 		pStmt = con.prepareStatement(sql);
	 		pStmt.setString(1, user.email);
	 		pStmt.setString(2, user.password);
	 		
	 		ResultSet rs = pStmt.executeQuery();
	 		
	 		
	 		login = rs.next(); // if next row is available which is our result it will return true else false
	 		if(login){
	 			user.name = rs.getString(2);
	 		}else{
	 			user.name = "NA";
	 		}
	 		
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
		
		return login;
	}
	
	// 5. Close Connection
	public void closeConnection(){
		try {
			con.close(); // to release memory resources
			System.out.println(">> Connection Closed");
		} catch (SQLException e) {
			System.out.println(">> Some Exception "+e);
		}
	}
	
}
