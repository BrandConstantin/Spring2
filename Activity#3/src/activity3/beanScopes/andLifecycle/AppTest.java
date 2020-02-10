package activity3.beanScopes.andLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from spring container
		Coach theCoach = context.getBean("myOtherCoach", Coach.class);
		Coach theBestCoach = context.getBean("myOtherCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == theBestCoach);		
		
		// call methods on the bean
		System.out.println("\nPointing to the same object: " + result);
		System.out.println(theCoach);
		System.out.println(theBestCoach);
		
		// close the context
		context.close();
	}

}
