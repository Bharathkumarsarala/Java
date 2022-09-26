package Learning;

import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args) {
		int n;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
		n=sc.nextInt();
		int temp=n;
		while(n>0) {
			int r=n%10;
			int fact=1;
			for(int i=r;i>=1;i--) {
				fact=fact*i;		
			}
			sum=sum+fact;
			n=n/10;	
		}
		n=temp;
		if(n==sum) {
			System.out.println("strong no");
		}
		else {
			System.out.println("not strong");
		}
	}

}
