package Exceptions;

public class Arithmatic {
	public static void main(String args[]) {
		
		int a=334;
		int b=0;
		int c;	
			try {
				c=a/b;
				System.out.println(c);	
			}
			catch(Exception e) {
				System.out.println(e);		
			}
		}
}
