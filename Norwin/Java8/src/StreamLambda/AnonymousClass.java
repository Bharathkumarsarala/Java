package StreamLambda;

public class AnonymousClass {
	public static void main(String args[]) {
		
//		Runnable r=new Runnable{
//		public void run() {
//			for(int i=0;i<4;i++) {
//				System.out.println("child thread");
//			}
//		}
//	};
		
		Runnable r=() -> {
			for(int i=0;i<3;i++) {
				System.out.println("child thread");
			}		
		};
		
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<2;i++) {
			System.out.println("main thread");
		}
		
	}

}