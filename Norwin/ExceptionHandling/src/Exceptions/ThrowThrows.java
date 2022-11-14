package Exceptions;

public class ThrowThrows {
	void divide(int a,int b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
	public static void main(String args[]) {
		ThrowThrows tt=new ThrowThrows();
		tt.divide(20,0);
	}
}
