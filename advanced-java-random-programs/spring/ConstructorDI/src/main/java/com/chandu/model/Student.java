package com.chandu.model;

public class Student {
	
	int id;
	String name;
	double percentage;
	String emailId;
	public Student(int id, String name, double percentage, String emailId) {
		this();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.emailId = emailId;
		
	}
	
	Student()
	{
		System.out.println("Bean is Created");
	}
	

}
