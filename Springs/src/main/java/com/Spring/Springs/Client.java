package com.Spring.Springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
		
//	Student student=new Student();
//	
//	MathCheat cheat=new MathCheat();
//	student.setMathCheat(cheat);
//	student.cheating();
//	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean file loaded");
		Student student = context.getBean("stu",Student.class);
		student.cheating();
	
		AnotherStudent anotherStudent = context.getBean("anotherstudent", AnotherStudent.class);
		anotherStudent.startCheating();
	}
	
}
