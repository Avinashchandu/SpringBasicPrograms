package day_1;

import java.util.Scanner;

public class palindrome {

	public static boolean palindrome(int a)
	{
		int sum = 0;
		int temp = a;
		while(temp!=0)
		{
		int rem = temp%10;
		sum = sum*10+rem;
		temp = temp/10;
		}
		if(a==sum)
		{
			return false;
		}
		else
		{
			return true;
		}
	
	}
	
	public static int reversesum(int a)
	{
		int sum = 0;
		int temp = a;
		while(temp!=0)
		{
		int rem = temp%10;
		sum = sum*10+rem;
		temp = temp/10;
		}
		sum = sum +a;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		int a = sc.nextInt();
		boolean status = true;
		while(status)
		{
			a=reversesum(a);
			status = palindrome(a);
		}
		System.out.println(a);
	}
}
