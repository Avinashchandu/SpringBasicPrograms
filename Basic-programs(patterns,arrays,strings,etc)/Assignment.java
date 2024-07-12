package basic;

import java.util.Scanner;

public class Assignment {
	public static boolean prime(int num)
	{
		int j = 0;
		int count = 0;
		if(num==1 || num==0)
		{
			return false;
		}
		for(int i = 2;i<(num/2)+1;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		j++;
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static boolean spyno(int a)
	{
		int sum = 0;
		int mul = 1;
		while(a!=0)
			{
			int rem = a%10;
			sum = sum + rem;
			mul = mul * rem;
			a = a/10;
			}
		if (sum == mul)
		{
			return true;
		}
		else
			return false;

	}
	

	public static void main(String[] args) {
		int sumFodd = 0;
		int sumFspy = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int sz = sc.nextInt();
		int b[]  = new int[sz];
		System.out.println("Enter the numbers");
		for(int i = 0;i<sz;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i = 0;i<sz;i++)
		{
			if(i%2==0) {
				sumFspy+=b[i];
			}
		}
		for(int i = 0;i<sz;i++)
		{

			if(i%2==0) {
				boolean s = prime(b[i]);
				if(s==true)
					b[i]=0;
			}
		}
		for(int i = 0;i<sz;i++)
		{

			if(i%2!=0) {
				boolean s = prime(b[i]);
				if(s==true)
					sumFodd+=b[i];
			}
		}
		for(int i = 0;i<sz;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("Summation of spy no : "+sumFspy);
		System.out.println("Summation of prime no : "+sumFodd);
		
	}
}
