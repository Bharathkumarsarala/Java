package com;

import java.util.Arrays;
import java.util.Scanner;

public class Prac {
	public static void main(String args[]) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array data 5:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		
	}

}
