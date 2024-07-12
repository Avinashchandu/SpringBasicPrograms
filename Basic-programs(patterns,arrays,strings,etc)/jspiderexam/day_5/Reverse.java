package day_5;

import java.util.Scanner;

public class Reverse {
	public static void rev(double dou)
	{
		
		
		Lamda l =(d)->
		{
			int count = 0;
			String s =Double.toString(d);
			int i = s.length()-1;
			String s1 ="";
			for(int j=s.length()-1;j>=0;j--)
			{
				if(s.charAt(j)=='.')
				{
					count=j;
				}
			}
			while(i>=0)
			{
				
				if(i==count)
				{
					s1+='.';
				}
				
				if(s.charAt(i)=='.')
				{
					i--;
					continue;
				}
				s1+=s.charAt(i);
				i--;
			}
			System.out.println(s1);
		};
		l.reverse(dou);
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		double d = sc.nextDouble();
		rev(d);
		
	}
	
}
