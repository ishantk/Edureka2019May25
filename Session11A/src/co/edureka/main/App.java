package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Address;
import co.edureka.model.Employee;
import co.edureka.model.Person;

/*
 	
 	Hibernate Procedure:
 	1. Configure Eclipse Project with Hibernate jars and type4 driver for database
 	   https://hibernate.org/orm/releases/5.4/
 	2. Copy hibernate.cfg.xml file into src directory and edit is as per our database
 	3. Copy employee.hbm.xml file into src directory and write hibernate mapping with java class
 	4. Create a Java Class representing a model object structure
 	5. Write a client class with main method to execute hibernate Code :)
 	
 */

public class App {

	public static void main(String[] args) {
		
//		Employee eRef1 = new Employee(1, "Leo", "leo@example.com", 50000, "Engineer");
//		Employee eRef2 = new Employee(2, "Fionna", "fionna@example.com", 30000, "HR");
//		
//		System.out.println(eRef1);
//		System.out.println(eRef2);
//		
		// Problem : Data is temporary in Object and we must save it !!
		// 		     DataBase : Create table and fire SQL Queries from Java Code
		//		     But Hibernate will help us to eliminate all this effort !!
		
		
		// Hibernate API's
		// SessionFactory creates Sessions
		SessionFactory sessionFactory = null;
		// Session is a connection to database and further will be used to execute insert/update/delete and query commands oon db
		Session session = null;
		// Atomicity -> Execution happens at once for sql statements
		Transaction transaction = null;
		
		try {
			// Parsing hibernate.cfg.xml file
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure() 
					.build();
			try {
				sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			}
			catch (Exception e) {				
				StandardServiceRegistryBuilder.destroy(registry);
			}
			
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();

			// 1. Insert data in tables -> save
			//session.save(eRef1);
			//session.save(eRef2);
			
			// 2. Fetch Record from Table
			/*
			Employee eRef = session.get(Employee.class, 2);
			System.out.println(">> Details Fetched:");
			System.out.println(eRef);
			
			// 3. Update the Record (Fetch Record before you update)
			eRef.setDesignation("Lead Engr");
			eRef.setSalary(78900);
			
			session.update(eRef);
			*/
			
			// 3. Fetch All 
			// 3.1. HQL i.e. Hibernate Query Language : https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
			/*
			//String hql = "From Employee";
			String hql = "From Employee where salary > 40000"; // order by and group by clauses will also work
			
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee emp : employees){
				System.out.println(emp);
			}
			*/
			
			//3.2. Criteria API if we do not wish to use HQL
			// Refer Documentation for API's and usage : https://hibernate.org/orm/documentation/5.4/
			/*
			Criteria criteria = session.createCriteria(Employee.class); // createCriteria -> is deprecated. So some new API has replaced it !!
			criteria.add(Restrictions.gt("salary", 30000));
			
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}
			*/
			
			// 4. Delete Operation
			/*Employee emp = new Employee();
			emp.setEid(2);	// Only Primary key value is required to delete the recode from Table
			session.delete(emp);*/
			
			// 5. Batch Operation : Execute multiple SQL Statements
			/*for(int i=1;i<=20;i++){
				Employee emp = new Employee(null, "Employee"+i, "emp"+i+"@example.com", 30000+i, "Engr");
				session.save(emp);
			}
			// Once transaction is committed we will have 20 employee objects to be saved together
			 */
			
			//session.createSQLQuery(sql); -> Explore API to execute RAW SQL Queries as well :)
			
//			session.save(eRef1);
//			session.save(eRef2);
			
			// 1st Level Hibernate Cache
			Employee eRef1 = session.get(Employee.class, 1);
			Employee eRef2 = session.get(Employee.class, 3);
			
			System.out.println(">> Details Fetched:");
			System.out.println(eRef1);
			System.out.println(eRef2);
			
			// Lets re-fetch the same details
			Employee eRef3 =  session.get(Employee.class, 1);
			Employee eRef4 =  session.get(Employee.class, 3);
			
			System.out.println(">> Details Re-Fetched:");
			System.out.println(eRef3);
			System.out.println(eRef4);
			
			// Explore EhCache API further for 2nd level cache :)
			
			transaction.commit();
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
		
		
	}

}
