package Learning;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
		int n=sc.nextInt();
		while(n>0) {
			int r=n%10;
			System.out.print(r);
			n=n/10;
		}
	}
}
