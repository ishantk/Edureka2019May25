package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Person pRef = new Person();
		pRef.setName("John Watson");
		pRef.setEmail("john@example.com");
		
		Address aRef = new Address();
		aRef.setAdrsLine("Redwood Shores");
		aRef.setCity("Bangalore");
		aRef.setZipCode(520001);
		aRef.setState("Karnataka");
		
		pRef.setAddress(aRef);  // 1 to 1 Relationship Mapped
		aRef.setPerson(pRef);	// 1 to 1 Relationship Mapped
		

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
				e.printStackTrace();
			}
			
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			transaction.begin();

			// Just save Person Object and Address Object will be saved automatically.
			// Insertion happens b=with a constraint of primary and foreign key 
			session.save(pRef);
			
			transaction.commit();
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}		

	}

}
