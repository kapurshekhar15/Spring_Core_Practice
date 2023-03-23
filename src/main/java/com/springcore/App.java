package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Here we want object but we will not create object manually ...will ask IOC
		// container to give the obj.....then we will use the obj...
		// Instantiating a container...
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// here context is a spring container......
		Student student1 = (Student) context.getBean("student2");// here we type casted Oject type to Student type
		Student student2 = (Student) context.getBean("student1");
		System.out.println(student2);
		System.out.println(student1);
	}
}
