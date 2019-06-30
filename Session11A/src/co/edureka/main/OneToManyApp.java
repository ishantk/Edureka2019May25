package co.edureka.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setName("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setName("CCNA");
		
		Certificate c3 = new Certificate();
		c3.setName("AWS");
		
		ArrayList<Certificate> certificates = new ArrayList<Certificate>();
		certificates.add(c1); //0
		//certificates.add(c2); //1
		certificates.add(c3); //2
		
		Manager mRef = new Manager();
		mRef.setName("George Watson");
		mRef.setEmail("george@example.com");
		mRef.setCertificates(certificates); // Linking of 1 to many Relationship
		
		System.out.println(mRef);
		
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

			// Just save Manager Object and Certificate List will be saved automatically. 
			session.save(mRef);
			
			transaction.commit();
			
			System.out.println(">> Hibernate Execution Done !!");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
		
	}

}
