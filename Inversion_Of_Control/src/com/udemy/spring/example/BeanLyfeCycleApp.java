package com.udemy.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLyfeCycleApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrive bean from spring container
		Coach trackCoach = context.getBean("myCoachTrack", Coach.class);

		System.out.println(trackCoach.getDailyWorkout());		
		
		// close the context
		context.close();
	}

}
