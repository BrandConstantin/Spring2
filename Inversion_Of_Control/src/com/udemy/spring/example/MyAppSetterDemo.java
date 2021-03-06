package com.udemy.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppSetterDemo {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call the methods on the bean
		System.out.println(theCoach.getDailyFortune() + " => " + theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmailAddress() + " and " + theCoach.getTeam());
		
		// close the context
		context.close();
	}
}
