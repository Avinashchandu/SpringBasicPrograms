package day_1;

import java.util.Scanner;

public class Consecutive_difference {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Size");
	int sz = sc.nextInt();
	System.out.println("enter numbers");
	int a[] = new int[sz];
	for(int i = 0;i<sz;i++)
	{
		a[i]=sc.nextInt();
	}
	int count = 0;
	int count1 = 0;
	for(int i = 0;i<a.length;i++)
	{
	if(i==a.length-2)
		break;
	if(a[i+1]-a[i]+1==a[i+2]-a[i+1])
	{
		System.out.print("{ ");
		count1++;
		System.out.print(a[i]+","+a[i+1]+","+a[i+2]);
		count = a[i+2]-a[i+1];
		i = i+2;
		while(count!=0)
		{
			if(i==a.length-1)
				break;
			i=i+1;
			count = count+1;
			if(a[i]-a[i-1]==count)
			{
				System.out.print(","+a[i]);
				count1++;
			}
			else
			{
				count = 0;
				i=i-1;
			}
		}
	}
	System.out.print(" }\n");
	}
	if(count1==0)
	{
		System.out.println("No consecutive elememts");
	}
	if(count1==0)
	{
		System.out.println("No consecutive elememts");
	}
}
}
