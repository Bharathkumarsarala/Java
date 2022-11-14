package Exceptions;

import java.util.Scanner;

public class Finally {
	public static void main(String args[]) {
		
		// if no exception 
//		int a=10;
//		int b=2;
//		int c;
//		try {
//			c=a/b;
//			System.out.println(c);
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("cant divide");			
//		}
//		finally {
//			System.out.println("executed");
//		}
//		System.out.println("main method end");	
		
		
		
		// if catch block has the same exception
//		int a=25;
//		int b=0;
//		int c;
//		try {
//			System.out.println("execution started");
//			c=a/b;
//			System.out.println("value of c:"+c);
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("cant divide");
//		}
//		finally {
//			System.out.println("executed");
//		}
//		System.out.println("mainmethod end");
		
		// if catch block has different exception 
		int a=25;
		int b=0;
		int c;
		try {
			System.out.println("execution started");
			c=a/b;
			System.out.println("value of c:"+c);
		}
		catch(NullPointerException npe) {
			System.out.println("cant divide");
		}
		finally {
			System.out.println("executed");
		}
		System.out.println("mainmethod end");
		
		
		
	}
}
