package com;

 class _7 {
 
	float a;
	int b;
      void add(int a,int b) {
    	     this.a = a;
    	     this.b = b;
    	  System.out.println(this.a);
    	  System.out.println(this.b);
      }
      
      void add(int b, float a) {
    	  this.b=b;
    	  this.a =a;
    	  System.out.println(this.b);
    	  System.out.println(this.a);
      }
 	 
	 
class Child{
		
		 void add(int b, float a) {
				
				int c;
				c=(int) (a+b);
		 }
				
}

 }
