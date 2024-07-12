package day_5;

import java.util.Scanner;

public class Tech_number {
	public static void techN0(int n)
	{
		int sum =0;
		int half = 0;
		int temp = n;
		int count =0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		if(count%2!=0)
		{
		
		}
		else
		{
		temp = n;
		
		for(int i =0;i<count/2;i++)
		{
		 int rem = temp%10;
		 half = half*10+rem;
		 temp = temp/10;
		}
		while(half!=0)
		{
		int rem = half%10;
		sum = sum*10+rem;
		half = half/10;
		}
		if((sum+temp)*(sum+temp) == n )
			System.out.println(n+" is a Tech No");
		
		}
		
		
	}
  public static void main(String[] args) {
	 
	for(int i =1000;i<=100000;i++)
	{
	techN0(i);
	}
}
}
