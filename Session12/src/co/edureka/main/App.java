package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Connection;

public class App {

	public static void main(String[] args) {
		
		/*
		Connection c1 = new Connection();
		c1.setUrl("jdbc:mysql://localhost/edureka");
		c1.setUserName("root");
		c1.setPassword("pass123");
		
		System.out.println("==Connection Details==");
		System.out.println(c1);
		*/

		// Challenge  : Connection as an Object is a configuration object
		//			    in case url changes or username or password we need to re build our source code !!
		
		// We use Spring FW IOC Principle
		// IOC -> Inversion Of Control
		//     -> Let developer not create any object. Object will be created by Spring FW
		//	   -> Spring FW's IOC Container will create and manage objects !!
		// We need to configure objects in XML file !!
		// Spring IOC Container will read XML file and create objects for us so that we can anytime manipulate data in objects by changingXML File
		
		
		// Spring IOC Procedure
		// 1. Create a Bean : Getters and Setters Mandatory
		// 2. Link all the Spring Core Jar Files in your eclipse project
		// 3. Copy anyname.xml file where we will configure our objects
		// 4. Create a Class with main method i.e. client class and use IOC Container from Spring FW to get reference of the object created by IOC Containers
		//    4.1 BeanFactory			| IOC Container
		//    4.2 ApplicationContext	| IOC Container
		
		// 4.1 BeanFactory	| IOC Container
		/*
		Resource resource = new ClassPathResource("beans.xml"); // Reading XML File
		BeanFactory factory = new XmlBeanFactory(resource);		// Constructing IOC Container
		System.out.println(">> IOC Container BeanFactory Constructed");
		
		// We are not creating object. rather we are getting reference to object which will be created by Spring IOC Container BeanFactory
		Connection c1 = (Connection)factory.getBean("cRef1");
		Connection c2 = factory.getBean("cRef2", Connection.class);
		System.out.println(c1);
		System.out.println(c2);
		
		// Objects will not be constructed by BeanFactory till time you do not say getBean()
		*/
		
		// 4.2 ApplicationContext	| IOC Container
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(">> IOC Container ApplicationContext Constructed");
		// Objects will not be constructed before hand by ApplicationContext even if you do not say getBean()
		
		Connection c1 = (Connection)context.getBean("cRef1");
		Connection c2 = context.getBean("cRef2", Connection.class);
		System.out.println(c1);
		System.out.println(c2);
		*/
		
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Connection c1 = context.getBean("cRef1", Connection.class);
		System.out.println(c1);
		System.out.println("c1 HashCode: "+c1.hashCode());
		
		System.out.println("==================");
		
		Connection c2 = context.getBean("cRef1", Connection.class); 
		System.out.println(c2);
		System.out.println("c2 HashCode: "+c2.hashCode());
		
		// c1 and c2 are just reference variables which will hold hashcode of objects !!
		*/
		
		// Life Cycle of a bean i.e. Object
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Connection c1 = context.getBean("cRef1", Connection.class);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}

}
