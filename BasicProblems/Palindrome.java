package Learning;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
//		String str = sc.nextLine();
//		
//		String str2 = "";
//		int length = str.length();
//		for(int i=length-1;i>=0;i--) {
//		   str2 = str2 + str.charAt(i);
//		}
//		if(str.equalsIgnoreCase(str2)) {
//			System.out.println("pali");
//		}
//		else {
//			System.out.println("not pali");
		int sum = 0;
		int n=sc.nextInt();
		int temp = n;
		while(n>0) {
			int result=n%10;
		    sum=(sum*10)+result;
		    n=n/10;
		}
		if(temp==sum) {
			System.out.println("pali");
		}
		else {
			System.out.println("not pali");
		}
		}
	}

