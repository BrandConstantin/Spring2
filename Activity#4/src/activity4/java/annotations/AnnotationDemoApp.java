package activity4.java.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		Coach firstCoach = context.getBean("firstCoach", Coach.class);
		Coach volleyCoach = context.getBean("volleyCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(firstCoach.getDailyWorkout());
		System.out.println(volleyCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
