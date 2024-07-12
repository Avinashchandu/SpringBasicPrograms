package com.dj.chandu;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dj.model.Bike;

public class user {
	
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("DI.xml");
		Bike bike = (Bike) app.getBean("bajaj");     
		Bike bike1 = (Bike) app.getBean("royalenfield");
		System.out.println("name: "+bike.nameOfBike());
		System.out.println("cc :"+bike.bikeCC());
		System.out.println("colour: "+bike.color());
        System.out.println("\n********************************************************\n");
        System.out.println("name: "+bike1.nameOfBike());
		System.out.println("cc :"+bike1.bikeCC());
		System.out.println("colour: "+bike1.color());
	}

}
