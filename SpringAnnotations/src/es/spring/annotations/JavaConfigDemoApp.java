package es.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method daily fortune
		System.out.println(theCoach.getDaylyFortune());
		
		// close the context
		context.close();
	}

}
