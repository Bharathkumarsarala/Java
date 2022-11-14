package exam;

import java.util.Scanner;

public class Third {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
        
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j<=1;j++) {
				System.out.print(" ");
				for(int k=5;k<=n;k++) {
					System.out.println(1 +" ");
				}
					
			}
		}
		System.out.println();
	}

}
