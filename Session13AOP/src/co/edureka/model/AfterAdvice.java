package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	// Shall be executed lastly after our core business method
	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object beanRef) throws Throwable {
		System.out.println("=======================");
		System.out.println(">> after executed : POST-PROCESSING");
		
		if(method.getName().equals("purchaseProduct")){
			
			// Extract Reference to the Same Product Object
			Product product = (Product)beanRef;
			if(product.getStock() > 0){
				System.out.println(">> Shipment Department Notified");
				System.out.println(">> Product "+product.getName()+" will be shipped by "+inputs[1]);
			}else{
				System.out.println(">> Sorry !! No Products Available !! Please Try Again !!");
			}
		}
		
		System.out.println("=======================");
		
	}

}
