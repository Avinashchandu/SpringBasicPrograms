package day_2;


import java.util.Scanner;

public class date {
	public static boolean date(String d)
	{
		int i =0;
		while(i<=3)
		{
			if(d.charAt(i)<'0' || d.charAt(i)>'9')
				return false;
			i++;
		}
		i++;
		while(i<=6)
		{
			if(d.charAt(i)<'0' || d.charAt(i)>'9')
				return false;
			i++;
		}
		i++;
		while(i<=9)
		{
			if(d.charAt(i)<'0' || d.charAt(i)>'9')
				return false;
			i++;
		}
		int year = Integer.parseInt(d.substring(0, 4));
		int month = Integer.parseInt(d.substring(5,7));
		int day =Integer.parseInt(d.substring(8));
		if(month==2)
		{
			if(day>29)
				return false;
		}
		if(month == 1 || month == 3 || month==5 || month ==8 || month ==10 || month==12)
		{
			if(day>31)
				return false;
		}
		else
		{
			if(day>30)
				return false;
		}
		if(month>12)
		{
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date");
		String d = sc.nextLine();
		boolean status = date(d);
		
		if(status == false)
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println("valid");
		}
	}
}
