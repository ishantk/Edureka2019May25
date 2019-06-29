package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Employee;

/*
 	
 	Hibernate Procedure:
 	1. Configure Eclipse Project with Hibernate jars and type4 driver for database
 	2. Copy hibernate.cfg.xml file into src directory and edit is as per our database
 	3. Copy employee.hbm.xml file into src directory and write hibernate mapping with java class
 	4. Create a Java Class representing a model object structure
 	5. Write a client class with main method to execute hibernate Code :)
 	
 */

public class App {

	public static void main(String[] args) {
		
		Employee eRef1 = new Employee(1, "John", "john@example.com", 30000, "Engineer");
		Employee eRef2 = new Employee(2, "Fionna", "fionna@example.com", 30000, "HR");
		
		System.out.println(eRef1);
		System.out.println(eRef2);
		
		// Problem : Data is temporary in Object and we must save it !!
		// 		     DataBase : Create table and fire SQL Queries from Java Code
		//		     But Hibernate will help us to eliminate all this effort !!
		
		// Hibernate API's
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parsing hibernate.cfg.xml file
			
			factory = config.buildSessionFactory(); // Factory to obtain Session Object for Connections
			
			session = factory.openSession(); // Creating Connection with DataBase
			
			transaction = session.beginTransaction();	// Start Transaction to fire SQL Queries
			
			session.save(eRef1);	// Insert Command
			
			transaction.commit();
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}finally{
			session.close(); // Close Connection with DB
		}
		
		
	}

}
