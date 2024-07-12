package basic;

import java.util.Scanner;

public class Lcm {
	public static int[] sort(int[] a)
	{
		for(int i = 0;i<a.length;i++)
		{
			int temp = 0;
			for(int j = i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a;

	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Size of Array");
    	int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter Elements");
		for(int i =0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		a=sort(a);
		int max = a[size-1];
		int lcm =1;
		int mul = 1;
		for(int i =0;i<size;i++)
		{
			mul*=a[i];
		}
		for(int i =max;i<=mul;i++)
		{
			int count = 0;
			for(int j=0;j<size;j++)
			{
				if(i%a[j]==0)
				{
					count++;
				}
				
			}
			if(count==size) {
				lcm = i;
				break;
				}
		}
		System.out.println("Lcm is "+lcm);
		
		
	}
}
