package co.edureka.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

import co.edureka.model.Connection;
import co.edureka.model.DataBase;

public class DIApp {

	public static void main(String[] args) {
		
//		Connection con1 = new Connection();
//		Connection con2 = new Connection();
//		
//		DataBase db1 = new DataBase();
//		db1.setConnection(con1);
//		
//		DataBase db2 = new DataBase(con2);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("depedencies.xml");
		DataBase db = context.getBean("database", DataBase.class);
		System.out.println("==DataBase Details==");
		System.out.println(db);
		
		//System.out.println(">> List of Tables:");
		//System.out.println(db.getTables());
		
		
	}

}
