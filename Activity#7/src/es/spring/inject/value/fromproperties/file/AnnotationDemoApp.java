package es.spring.inject.value.fromproperties.file;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from spring container
		Coach theCoach = context.getBean("wrestlingCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method daily fortune
		System.out.println(theCoach.getDaylyFortune());
		
		// close the context
		context.close();
	}

}
