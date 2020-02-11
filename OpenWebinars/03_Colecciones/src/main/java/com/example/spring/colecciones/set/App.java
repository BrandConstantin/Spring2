package com.example.spring.colecciones.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/example/collections/xml/beans_set.xml");

		Alumno p = (Alumno) appContext.getBean("Luismi");

		System.out.println(p);

		((ConfigurableApplicationContext) appContext).close();
	}
}
