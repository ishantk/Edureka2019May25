package co.edureka;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 	1. Go to MySQL Console/GUI
 	2. Create a DataBase with a name
 	3. Write SQL Query and create Table
 	
 	Java Class Code Structure:
 	public class Customer {
		String name;
		String phone;
		String email;
	}
	
	Class Name 				: Table Name
	Attributes 				: Column Names
	1 Additional Attribute 	: Sr. No. or Customer ID which will uniquely distinguish the entrire record 
	
 	SQL Structure:
 	create table Customer(
 		id int primary key auto_increment,
 		name varchar(256),
 		phone varchar(16),
 		email varchar(256)
 	)
 	
 	Java Object Construction
 	Customer cRef = new Customer("John", "+91 99999 88888", "john@example.com");
 	
 	SQL Insert Command
 	insert into Customer values(null, 'John', '+91 99999 88888', 'john@example.com') | null for id will automatically substitute the data
 	
 	SQL Update Command
 	update Customer set name = 'John Watson', phone = '+91 99999 88888', email = 'john.w@example.com' where id = 1
 	
 	SQL Delete Command
 	delete from Customer where id = 1
 	
 	SQL Select Command : to Fetch Data from Table
 	select * from Customer
 	select name, phone from Customer
 	select * from Customer where id = 5
 	select * from Customer order by id desc
 	..
 	....
 	
 
 */

/*
 	JDBC : Java Data Base connectivity
 	From Java Program we shall save the data of object in the table :)
 	
 	Procedure:
 	1. Load the Driver
 		Download Driver from DB Vendor Website
 		Configure the build path of our project in eclipse to link the driver to our java program
 		
 		Use Class.forName() API to load the Driver
 		
 	2. Create Connection with DataBase
 		Username, Password, URL and DB Name is required to create connection
 		Use Connection and DriverManager API to form Connection with DataBase
 		
 	3. Write SQL Statement
 		String sql = "insert into Customer values(null, 'John', '+91 99999 88888', 'john@example.com')";
 		
 	4. Execute SQL Command over the Connection
 		Use Statment or PreparedStatement API to execute SQL Statement
 		
 	5. Close the Connection with DataBase
 		execute a method close() on Connection Reference
 	
 	
 */


public class DBHelper {

	// API to create Connection with DB
	Connection con;
	
	// API to execute SQL Statement 
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt; // To execute Stored Procedures
	
	// 1. Load the Driver
	DBHelper(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
		}catch(Exception e){
			System.out.println(">> Some Exception "+e);
		}
	}
	
	// 2. Create Connection with DataBase
	void createConnection(){
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
	
	// 3. and 4. Write and Execute SQL Statement
	void saveCustomer(Customer customer){ // Take Input as Customer Object's Reference
		try {
			// 3. Write SQL Statement
			// We have substituted data from our object into SQL Statement :)
	 		String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"')";
			
	 		// 4. Execute SQL Statement
	 		stmt = con.createStatement(); 		  // Create Statement Object and Get the Reference of it from Connection
	 		int i = stmt.executeUpdate(sql); 	  // executeUpdate method will perform 3 types of SQL Executions : insert, update and delete commands
	 		
	 		if(i>0){
	 			System.out.println(">> "+customer.name+" Saved !!");
	 		}else{
	 			System.out.println(">> "+customer.name+" Not Saved !!");
	 		}
	 		
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
	}
	
	void updateCustomer(Customer customer, int id){ // Take Input as Customer Object's Reference
		try {
			// 3. Write SQL Statement
			// We have substituted data from our object into SQL Statement :)
	 		String sql = "update Customer set name = ?, phone = ?, email = ? where id = ?";
			
	 		// 4. Execute SQL Statement
	 		pStmt = con.prepareStatement(sql);
	 		pStmt.setString(1, customer.name);
	 		pStmt.setString(2, customer.phone);
	 		pStmt.setString(3, customer.email);
	 		pStmt.setInt(4, id);
	 		
	 		int i = pStmt.executeUpdate(); 	  // executeUpdate method will perform 3 types of SQL Executions : insert, update and delete commands
	 		
	 		if(i>0){
	 			System.out.println(">> "+customer.name+" Updated !!");
	 		}else{
	 			System.out.println(">> "+customer.name+" Not Updated !!");
	 		}
	 		
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
	}
	
	void deleteCustomer(int id){ // Take Input as Customer Object's Reference
		try {
			// 3. Write SQL Statement
			// We have substituted data from our object into SQL Statement :)
	 		String sql = "delete from Customer where id = ?";
			
	 		// 4. Execute SQL Statement
	 		pStmt = con.prepareStatement(sql); // Create Statement Object and Get the Reference of it from Connection
	 		pStmt.setInt(1, id);
	 		int i = pStmt.executeUpdate();	  // executeUpdate method will perform 3 types of SQL Executions : insert, update and delete commands
	 		
	 		if(i>0){
	 			System.out.println(">> "+id+" Deleted");
	 		}else{
	 			System.out.println(">> "+id+" Not Deleted");
	 		}
	 		
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
	}
	
	void showCustomers(){
		try {
			
			String sql = "select * from Customer";
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery(); // PS: for Select statement we need to use executeQuery method instead of executeUpdate
			// ResultSet API will hold data which is fetched from Customer Table
			
			while(rs.next()){ // Iterate over rows
				Customer cRef = new Customer();
				int id = rs.getInt(1);
				cRef.name = rs.getString(2);
				cRef.phone = rs.getString(3);
				cRef.email = rs.getString(4);
				
				System.out.println("-------------------------------");
				System.out.println(">> Details for Customer ID#"+id);
				cRef.showCustomerDetails();
				System.out.println("-------------------------------");
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
	}
	
	void executeProcedure(Customer customer){ // Take Input as Customer Object's Reference
		try {
			// 3. Write SQL Statement
			// We have substituted data from our object into SQL Statement :)
	 		String sql = "{ call addCustomer(?, ?, ?) }";
			
	 		// 4. Execute SQL Statement
	 		cStmt = con.prepareCall(sql);
	 		cStmt.setString(1, customer.name);
	 		cStmt.setString(2, customer.phone);
	 		cStmt.setString(3, customer.email);
	 		
	 		cStmt.execute(); 	 // execute is the methof for executing CallableStatement
	 		
	 		System.out.println(">> Procedure Executed");
	 		
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
		}
	}
	
	void processBatchAsTransaction(){
		try {
			
			//String sql1 = "insert into Customer values(null, 'Harry', '+91 90090 80080', 'harry@example.com')";
			//String sql2 = "update Customer set name = 'George Watson', email = 'george.w@example.com' where id = 6";
			
			String sql1 = "delete from Customer where id = 6";
			String sql2 = "update Customer set cname = 'Fionna', email = 'fionna.123@example.com' where id = 7"; // statement will produce error
			
			con.setAutoCommit(false);  // We ourselves will manage our batch processing as Transaction
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			int[] arr = stmt.executeBatch();
			
			con.commit(); 	// Execution of Batch should be a transaction
			System.out.println(">> Batch Processed as Transaction");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception "+e);
			
			try {
				con.rollback();		// Revert any changes if done in database in case of errors :)
				System.out.println(">> Transaction Rolled Back");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	
	// 5. Close Connection
	void closeConnection(){
		try {
			con.close(); // to release memory resources
			System.out.println(">> Connection Closed");
		} catch (SQLException e) {
			System.out.println(">> Some Exception "+e);
		}
	}

}
