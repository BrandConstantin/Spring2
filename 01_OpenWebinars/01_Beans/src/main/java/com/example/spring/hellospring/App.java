package com.example.spring.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/example/xml/beans.xml");
        
        Mundo m = (Mundo) appContext.getBean("mundo");
        
        System.out.println(m.getMensaje());
    }
}