package StreamLambda;

interface Interff {
	public int squareIt(int n);
}

public class ParaLambdaReturn {
	public static void main(String args[]) {
		Interff i = (n) -> n * n;
		System.out.println(i.squareIt(4));
	}

}
