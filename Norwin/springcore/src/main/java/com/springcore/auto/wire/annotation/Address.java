package com.springcore.auto.wire.annotation;

public class Address {
	
	
	String street;
	String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
