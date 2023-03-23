package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
          Student student = con.getBean("s1",Student.class);
//          System.out.println(student);
//          
//          System.out.println(student.getAddress());
//          System.out.println(student.getAddress().getClass().getName());
          
          System.out.println(student.hashCode());
          
          
        Student s2 =  con.getBean("s1",Student.class);
        System.out.println(s2.hashCode());

	}

}
