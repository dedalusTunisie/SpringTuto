package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		  ApplicationContext context = new ClassPathXmlApplicationContext("mvc-config.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.getMessage();
	      
	      System.out.println("change");
	      System.out.println("change");
	}

}
