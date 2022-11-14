package com;

import java.util.Scanner;

public class End {
	public static void main(String args[]) {

		// arithmetic
//			int x=786;
//			int y=0;
//			try {
//				int z=x/y;		
//			}
//			catch(ArithmeticException ae) {
//				System.out.println("no cannot be divide");
//			}

		// nullpointer
//			
//			try {		
//		        String str = null;
//				int l = str.length();
//				System.out.println(l);
//			} 
//			catch (NullPointerException n) {
//				System.out.println("null cannot be casted");
//			}

		// numberformat
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter string:");
//		String str = sc.nextLine();
//		try {
//			int n = Integer.parseInt(str);
//			System.out.println(n);
//		}
//		
//		catch (NumberFormatException n) {
//			System.out.println("given string cannot be converted to integer");
//		}
		
		
	     try {
	            try {
	            	String str = null;
					int l = str.length();
					System.out.println(l);
	            } catch (NullPointerException e) {
	                System.out.println(e);
	            }
	            try {
	                int a = 456;
	                int b = 0;
	                int c = a/b;
	            } catch (ArithmeticException e) {
	                System.out.println(e);
	            }
	            try {
	            	Scanner sc = new Scanner(System.in);
	        		System.out.println("enter string:");
	        		String str = sc.nextLine();
	        		int n = Integer.parseInt(str);
          			System.out.println(n);       
	            }
	            catch (NumberFormatException e) {
	                System.out.println(e);
	            }
	        } 
	        catch (Exception e) {
	            System.out.println(e);
	        }
	        System.out.println("finish");
	}
}
