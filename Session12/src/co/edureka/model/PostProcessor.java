package co.edureka.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println("==postProcessAFTERInitialization==");
		return beanRef;
	}


	public Object postProcessBeforeInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println("==postProcessBEFOREInitialization==");
		return beanRef;
	}

}
