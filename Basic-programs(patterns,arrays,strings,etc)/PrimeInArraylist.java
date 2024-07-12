package basic;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeInArraylist {
	public static boolean prime(int num)
	{
		int j = 0;
		int count = 0;
		if(num==1 || num==0)
		{
			System.out.println(num+" is Neither Prime Nor Composite");
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
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of digits to be Entered");
		int n = sc.nextInt();
		System.out.println("Enter Numbers");
		for(int i = 0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		for(int i = 0;i<n;i++)
		{
			if(prime((int)a.get(i)))
			{
				System.out.println(a.get(i)+" is prime");
			}
		}
	}
}
