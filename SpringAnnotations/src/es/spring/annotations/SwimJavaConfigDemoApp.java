package es.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method daily fortune
		System.out.println(theCoach.getDaylyFortune());
		
		// inject value from properties file
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		// call the swim coach methods
		System.out.println("email " + swimCoach.getEmail());
		System.out.println("team " + swimCoach.getTeam());
		
		// close the context
		context.close();
	}

}
