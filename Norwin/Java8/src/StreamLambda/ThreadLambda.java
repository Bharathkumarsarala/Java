package StreamLambda;

public class ThreadLambda {
	public static void main(String args[]) throws InterruptedException {

		Runnable r = () -> {
			for (int i = 1; i <= 4; i++) {
				System.out.println("child thread");	
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i <= 2; i++) {
			System.out.println("main thread");
			Thread.sleep(10000);
		}
	}
}
