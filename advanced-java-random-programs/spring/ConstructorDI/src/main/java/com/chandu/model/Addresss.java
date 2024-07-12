package com.chandu.model;

public class Addresss {
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	int pin;
	String street;
	String city;
	String state;
	public Addresss(int pin, String street, String city, String state) {
		super();
		this.pin = pin;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	


}
