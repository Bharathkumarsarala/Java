package Learning;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int n;
		int i;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(n%i==0);
			count++;
		}
		if(count==2) {
			System.out.println("prime no");
			
		}
		else {
			System.out.println("not prime");
		}
	}

}
