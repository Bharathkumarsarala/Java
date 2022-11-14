package exam;
import java.util.Scanner;
public class First {
	public static void main(String args[]) {
			int r;
			int sum=0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a no :");
			int n = sc.nextInt();
			while(n>0) {
				r = n%10;
				int arm = r*r*r;
				sum = sum+arm;
				n=n/10;
					
			}
			System.out.println("armstrongno :" + sum);
		}
	}


