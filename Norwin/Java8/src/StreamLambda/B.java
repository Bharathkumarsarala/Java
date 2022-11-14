package StreamLambda;

class B extends A {
	public static void main(String args[]) {
// using threads
		A r = new A();
		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i<2; i++) {
			System.out.println("this is main thread");
		}
	}
}
