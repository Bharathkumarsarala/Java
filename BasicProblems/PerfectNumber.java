package Learning;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int j;
		int i;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no:");
		j = sc.nextInt();
		
		for(i=1;i<j;i++) {
			if(j%i==0) {
				sum=sum+i;
			}
		}
		if(j==sum) {
			System.out.println("perfect no");
		}
		else {
			System.out.println("not a perfect no");
		}
	}
}

