package day_2;

import java.util.Date;
import java.util.Scanner;

public class Date1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date d = new Date();
		int hours = d.getHours();
		int min = d.getMinutes();
		int day = d.getDate();
		int month = d.getMonth();
		int year = d.getYear();
		month = year/100;
		year=2000+year%100;
		System.out.println("Enter hours to add");
		int addT=sc.nextInt();
		System.out.println("Enter min to add");
		int addm=sc.nextInt();
		hours+=addT;
		min+=addm;
		if(min>60)
		{
			min = min-60;
			int rem = min/60;
			hours = hours+1+rem;
		}
		if(hours>24)
		{
			hours = hours - 24;
			int rem = hours/24;
			day = day+rem+1;
		}
		
	System.out.println(day+"-"+month+"-"+year);	
	}
}
