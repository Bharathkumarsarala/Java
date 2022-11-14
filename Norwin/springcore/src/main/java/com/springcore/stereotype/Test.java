package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collections.Person;

public class Test {
	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("student", Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		
		System.out.println(student.hashCode());
		
//		Student student2 = context.getBean("ob",Student.class);
//		System.out.println(student2.hashCode());
	}

}
