package StreamLambda;

interface Interf {
	public void add(int a,int b);
}

public class ParaLambda {
	public static void main(String args[]) {
		Interf i=(a,b) -> System.out.println("sum:"+(a+b));
		i.add(10,20);
	}
}

 
