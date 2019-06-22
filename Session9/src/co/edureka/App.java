package co.edureka;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		// Object Construction Statement
		Customer cRef = new Customer();
		
		// To read data from Console:
		Scanner sRef = new Scanner(System.in);
		
		System.out.println(">> Enter Customer Name: ");
		cRef.name = sRef.nextLine();
		
		System.out.println(">> Enter Customer Phone: ");
		cRef.phone = sRef.nextLine();
		
		System.out.println(">> Enter Customer Email: ");
		cRef.email = sRef.nextLine();
		
		System.out.println();
		
		cRef.showCustomerDetails();
		
		System.out.println();
		
		// Data in Object is temporary as Object is in the Heap area of RAM :)
		// We must save the data 
		// Persistence:
		// 1. Files
		// 2. XMLs
		// 3. DataBases
		
		// DataBase : RDBMS -> MySQL
		// DataBase is a collection of Tables. Table is Columns and Rows
		// To create Table we will use ORM -> Object Relational Mapping
		// ORM : Table Name will be Class name and Column Names will be Attributes of the Object
		// Table : Customer | Columns : name, phone and email
		
		//System.out.println(">> Would you like to Save Customer "+cRef.name+"? yes/no: ");
		System.out.println(">> Would you like to Update Customer "+cRef.name+"? yes/no: ");
		String choice = sRef.nextLine();
		
		if(choice.equals("yes")){
			DBHelper db = new DBHelper(); 	// Load the driver
			db.createConnection();   	  	// Create Connection
			//db.saveCustomer(cRef);		  	// Write and Execute SQL Statement
			
			db.updateCustomer(cRef, 4);
			
			db.closeConnection(); 			// Close Connection with DB
		}else{
			System.out.println(">> Thank You :)");
		}
		*/
		
		/*Scanner sRef = new Scanner(System.in);
		System.out.println(">> Enter Customer ID to Delete: ");
		int id = sRef.nextInt();
		
		DBHelper db = new DBHelper(); 	// Load the driver
		db.createConnection();   	  	// Create Connection
		db.deleteCustomer(id);
		db.closeConnection(); 			// Close Connection with DB
		*/
		
		/*DBHelper db = new DBHelper(); 	// Load the driver
		db.createConnection();   	  	// Create Connection
		db.showCustomers();
		db.closeConnection(); 			// Close Connection with DB
		*/
		
		//Customer customer = new Customer("Fionna Flynn", "+91 99999 88888", "fionna@example.com");
		DBHelper db = new DBHelper(); 	// Load the driver
		db.createConnection();   	  	// Create Connection
		//db.executeProcedure(customer);
		
		db.processBatchAsTransaction();
		
		db.closeConnection();
	}

}
