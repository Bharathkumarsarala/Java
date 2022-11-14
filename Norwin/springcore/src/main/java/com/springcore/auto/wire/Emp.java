package com.springcore.auto.wire;

public class Emp {

	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor....");
	}
 
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
