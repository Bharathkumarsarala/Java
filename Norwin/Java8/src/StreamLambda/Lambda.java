package StreamLambda;

interface Interf {

	public void m1();
}

public class Lambda {

	public static void main(String args[]) {
		Interf i = () -> System.out.println("hi");
		i.m1();
	}

}
