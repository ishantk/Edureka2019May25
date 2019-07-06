package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Child;
import co.edureka.model.Father;

public class InheritanceApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
		Father father = context.getBean("fRef", Father.class);
		Child child = context.getBean("cRef", Child.class);
		
		System.out.println("==Father Details==");
		System.out.println(father);
		
		System.out.println();
		
		System.out.println("===Child Details===");
		System.out.println(child);
		

	}

}
