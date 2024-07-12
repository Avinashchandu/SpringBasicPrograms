package basic;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int sz = sc.nextInt();
		int a[] = new int[sz];
		System.out.println("Enter Elements");
		for(int i = 0 ;i<sz;i++)
		{
			a[i]=sc.nextInt();
			count++;
			for(int j = 0;j<count;j++)
			{
				int temp = a[i];
				if(a[j]>a[i])
				{
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
