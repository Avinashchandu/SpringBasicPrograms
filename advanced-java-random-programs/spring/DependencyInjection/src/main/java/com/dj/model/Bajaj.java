package com.dj.model;

public class Bajaj implements Bike {

	
	String name;
	String cc;
	String color;
	@Override
	public String nameOfBike() {
		return name;
	}

	@Override
	public String bikeCC() {
		// TODO Auto-generated method stub
		return cc;
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return color;
	}

	public Bajaj(String name, String cc, String color) {
		super();
		this.name = name;
		this.cc = cc;
		this.color = color;
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
