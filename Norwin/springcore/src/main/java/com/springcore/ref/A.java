package com.springcore.ref;

public class A {
	
	int x;
	private B ob;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
}
