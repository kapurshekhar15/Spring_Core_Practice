package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// AbstractApplicationContext is used for registershutdownHook......
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

//		Samosa s = (Samosa) context.getBean("s1");
//		System.out.println(s);
//		//registering shutdown hook
		context.registerShutdownHook();
//		
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		
//		
//		System.out.println(p1);

		Example example = (Example) context.getBean("e1");
		System.out.println(example);
	}

}
