package basic;

import java.util.Scanner;

public class RotationOfNumber {
	public static int count(int a)
	{
		int count = 0;
		while(a!=0)
		{
			a=a/10; 
			count++;
		}
		return count;
	}
   public static void main(String[] args) {
	   int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int a = sc.nextInt();
	System.out.println("Enter key");
	int key = sc.nextInt();
	int mul = 1;
	int sz = count(a);
	for(int i = 0;i<sz-1;i++)
	{
		mul*=10;
	}
	for(int i = 0;i<=sz-1;i++)
	{
		int rem = a%10;
		rem*=mul;
		a=a/10;
		a=rem+a;
		if(key==a)
		{
			count++;
			break;
		}
		
	}
	if(count==1)
	{
		System.out.println("key is in Rotation of number");
	}
	else
	{
		System.out.println("Number is not Key");
	}
	
	
}
}
