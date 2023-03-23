package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)

	{

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/auto/wire/annotation/autoconfig.xml");
		Emp e1 = context.getBean("emp1", Emp.class);// Emp.class is doing downcasting...here!!!
		System.out.println(e1);
	}

}
