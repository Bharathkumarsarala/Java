package com;


public class _777 {

	class Overrid {
		int c;
		int d;
		int e;
		void add(int c, int d, int e) {
			this.c = c;
			this.d = d;
			System.out.println(this.c);
			System.out.println(this.d);
		}
	    void add(int c, int  d,int e) {
	    	this.c = c;
	    	this.d = d;
	    	this.e= e;
	    	System.out.println(this.c);
	    	System.out.println(this.d);
	    	System.out.println(this.e);
	    }
	} 
	 
class final2 extends _777{
		
		public static void main(String args[]) {
			Overrid obj = new Overrid();
			obj.add(5,10,15);
			obj.add(15, 20,15);
			System.out.println("overriding");
		}
}



