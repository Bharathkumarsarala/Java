package com;

public class _8 extends Thread {

	public void run() {
		System.out.println("running");
		int a = 10;
		int b=20;
		int c = a+b;
		System.out.println(c);
		
		//for(int i=1;i<10;i++) {
		  //System.out.println(i);
	//	}
	}
	
class Final extends Thread {
	public static void main(String args[]) {
		_8 obj = new _8();
		_8.start();
		
		
	}
}
	
}
