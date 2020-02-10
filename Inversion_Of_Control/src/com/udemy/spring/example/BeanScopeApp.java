package com.udemy.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrive bean from spring container
		Coach theCoach = context.getBean("Coach", Coach.class);
		Coach alphaCoach = context.getBean("Coach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print the results
		if(result) {
			System.out.println(result);
			System.out.println(theCoach + " and " + alphaCoach);
		}else {
			System.out.println(result);
			System.out.println(theCoach + " and " + alphaCoach);
		}
		
		// close the context
		context.close();
	}

}
