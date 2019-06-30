package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.CA;
import co.edureka.model.CB;
import co.edureka.model.CC;

public class InheritanceApp {

	public static void main(String[] args) {
		
		CA caRef = new CA();
		caRef.setA(10);

		CB cbRef = new CB();
		cbRef.setA(100);
		cbRef.setB(200);

		CC ccRef = new CC();
		ccRef.setA(1000);
		ccRef.setB(2000);
		ccRef.setC(3000);
		

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

			session.save(caRef);
			session.save(cbRef);
			session.save(ccRef);
			
			transaction.commit();
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
		
	}

}
