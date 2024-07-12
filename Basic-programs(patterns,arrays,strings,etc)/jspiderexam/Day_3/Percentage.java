package Day_3;

import java.util.Scanner;

public class Percentage {
	public static void percent(String s)
	{
		double num = 0;
		double capital =0;
		double lower = 0;
		double special = 0;
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
			    num++;
			    continue;
			}
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				lower++;
				continue;
			}
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
			    capital++;
			    continue;
			}
			special++;	
		}
		double total =num+lower+capital+special;
		System.out.println("Capital letters = "+(int)capital+" Percentage = "+(capital/total)*100);
		System.out.println("Lower letters = "+(int)lower+" Percentage = "+(lower/total)*100);
		System.out.println("Numbers  = "+(int)num+" Percentage = "+(num/total)*100);
		System.out.println("Special letters = "+(int)special+" Percentage = "+special+(special/total)*100);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		percent(s);
		
	}
}
