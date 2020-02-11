package com.example.spring.colecciones.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/example/collections/xml/beans_list.xml");

		Provincia p = (Provincia) appContext.getBean("Sevilla");

		System.out.println(p.toString());

		((ConfigurableApplicationContext) appContext).close();
	}
}
