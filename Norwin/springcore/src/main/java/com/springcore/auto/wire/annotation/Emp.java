package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("temp2")
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
		System.out.println("constructor....");
	}
 
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
