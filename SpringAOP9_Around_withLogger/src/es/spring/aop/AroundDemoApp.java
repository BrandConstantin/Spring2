package es.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import es.spring.aop.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		TrafficFortuneService theFortuneS = context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		String data = theFortuneS.getFortune();
		System.out.println(data);
		
		// close the context
		context.close();
	}

}
