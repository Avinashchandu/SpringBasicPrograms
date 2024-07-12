package com.dj.model;

public class Address {
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	int pin;
	String street;
	String city;
	String state;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
