package co.edureka.main;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Product;

public class SprinAOPApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Product product = context.getBean("pRef", Product.class);
		Product product = context.getBean("proxy", Product.class);
		
//		System.out.println("===Product Details==");
//		System.out.println(product);
//		
//		System.out.println();
		
		product.purchaseProduct("Net Banking", "Evening by 6PM"); // Execution of Business Method
		
		// PS:
		// For Spring AOP we need to configure an API in our XML File
		// ProxyFactoryBean has to be configured
		
	}

}
