package basic;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int j = 0;
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num = sc.nextInt();
		if(num==1 || num==0)
		{
			System.out.println(num+" is Neither Prime Nor Composite");
		}
		for(int i = 2;i<(num/2)+1;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Prime No");
		}
		else
		{
			System.out.println("Not Prime");
		}
		j++;
		
	}
	}


