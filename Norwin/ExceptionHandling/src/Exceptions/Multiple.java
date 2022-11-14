package Exceptions;

public class Multiple {
	public static void main(String args[]) {
		try {
			int a = 25;
			int b = 0;
			int c=a/b;			
			System.out.println("value of c:" + c);
		} catch (Exception e) {
			System.out.println("cant divide");
		}
		try {
			String str=null;
			System.out.println(str.toUpperCase());
			}
			catch(NullPointerException n) {
				System.out.println("null cannot be casted");
		}
	
	}
}

