package com.example.spring.referencias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"com/example/resources/xml/beans_anidados_constructor.xml");

		Vehiculo v1 = (Vehiculo) appContext.getBean("vehiculo");
		v1.setMarca("Porsche");
		v1.setModelo("911");

//		Vehiculo v2 = (Vehiculo) appContext.getBean("vehiculo");
//		v2.setMarca("Seat");
//		v2.setModelo("Marbella");

		System.out.println(v1);
//		System.out.println(v2);

		((ConfigurableApplicationContext) appContext).close();

	}

}