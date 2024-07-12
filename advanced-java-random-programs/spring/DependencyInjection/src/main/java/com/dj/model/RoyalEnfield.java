package com.dj.model;

public class RoyalEnfield implements Bike {
	
	public RoyalEnfield(String name, String cc, String color) {
		super();
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	String name;
	String cc;
	String color;
	@Override
	public String nameOfBike() {
		return name;
	}
	@Override
	public String bikeCC() {
		return cc;
	}
	@Override
	public String color() {
		return color;
	}
	@Override
	public void welcome() {
		System.out.println("welcome");
		
	}

	@Override
	public void bye() {
		System.out.println("tata");
		
	}
}
