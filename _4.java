package com;

public class _4 {

	public static void main(String args[]) {
		int r,sum=0,temp,n=222;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("pali no:");
			
		}
		else {
			System.out.println("not pali");
		
		}
	}
}
