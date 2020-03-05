package es.spring.aop;

import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.spring.aop.service.TrafficFortuneService;

public class AroundHandlExceptionDemoApp {
	private static Logger myLogger = Logger.getLogger(AroundHandlExceptionDemoApp.class.getName());

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		TrafficFortuneService theFortuneS = context.getBean("trafficFortuneService", TrafficFortuneService.class);

		myLogger.info("Main program: Around With Logger Demo App");
		myLogger.info("Now we calling the getFortune() method");
		
		boolean tripWire = true;
		String data = theFortuneS.getFortune(tripWire);
		myLogger.info(data);

		// close the context
		context.close();
	}

}
