package com.springcore;

import java.beans.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Student s = (Student) context.getBean("stud");
		Student s2 = (Student) context.getBean("student2");
		
		System.out.println(s);
		System.out.println(s2);
	}
}
