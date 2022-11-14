package Exceptions;

import java.util.Scanner;

public class Throw {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();
		if (age < 18) {
			throw new ArithmeticException("not eligible");
		} else {
			System.out.println("eligible");
		}
	}
}