package Exceptions;
import java.util.*;
public class numberFormat {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		try {
			int n=Integer.parseInt(str);
			System.out.println(n);
		}
		catch(NumberFormatException n) {
			System.out.println("given string cannot be converted to integer");
		}
	}
}