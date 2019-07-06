package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// Before Shall be Executed before our core business logic
	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println("=======================");
		System.out.println(">> before executed : PRE-PROCESSING");
		
		if(method.getName().equals("purchaseProduct")){
			
			// Extract Reference to the Same Product Object
			Product product = (Product)beanRef;
			if(product.getStock() > 0){
				System.out.println(">> Product is Available. You can Please Procced with Payments using "+inputs[0]);
			}else{
				System.out.println(">> Sorry !! No Products Available !! Please Try Again !!");
			}
		}
		
		System.out.println("=======================");
	}

}
