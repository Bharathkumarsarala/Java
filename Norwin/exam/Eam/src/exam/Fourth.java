package exam;
import java.util.*;
public class Fourth {	
	   static void divisors(int n)
	    {
	        for (int i=1;i<=n;i++)
	            if (n%i==0)
	                System.out.println(i);
	    }
	     
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("enter the number :");
	    	int num= sc.nextInt();
	        System.out.println("divisors of given are "+num+" are: ");
	        divisors(num);
	    }
	
	}

