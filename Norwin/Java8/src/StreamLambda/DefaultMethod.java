package StreamLambda;

interface DefaultMethod {
	default void m1() {
		System.out.println("default method");
	}
}

class MainTest implements DefaultMethod {
	public void m1() {
		System.out.println("overrides default method");
	}
	public static void main(String args[]) {
		MainTest mt=new MainTest();
	    mt.m1();
	

	}
}
