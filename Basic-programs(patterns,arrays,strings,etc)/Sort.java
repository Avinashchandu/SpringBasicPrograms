package basic;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int sz = sc.nextInt();
		int a[]=new int[sz];
		System.out.println("Enter Elements");
		for(int i = 0;i<a.length;i++)
		{
		a[i]=sc.nextInt();	
		}
		for(int i = 0;i<a.length-1;i++)
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
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}