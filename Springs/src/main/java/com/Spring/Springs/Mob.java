package com.Spring.Springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mob {
	public static void main(String args[]) {
		
//		Air a = new Air();
//		a.calling();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(" app context is loaded");
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		
	}
	
}


