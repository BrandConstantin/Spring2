package es.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrive bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print result
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		// close context
		context.close();
	}
}
