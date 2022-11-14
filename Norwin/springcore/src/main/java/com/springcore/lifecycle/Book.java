package com.springcore.lifecycle;

public class Book {
	
	public double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)  {
		System.out.println("setting price");
		this.price = price;
	} 

	public Book() {
		super();
		
	}

	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	public void init() {    
		System.out.println("inisde init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}
}
