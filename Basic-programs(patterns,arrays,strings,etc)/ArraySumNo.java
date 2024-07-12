package basic;

import java.util.Scanner;

public class ArraySumNo {
	public static String binary(int a)
	{
		int temp = a;
		String s = new String();
		while(temp!=0)
		{
			int rem = temp%2;
			temp = temp/2;
			s=s+rem;
		}
		String s1 = new String();
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		return s1;
		
	}
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int sz = sc.nextInt();
		int a[]=new int[sz];
		System.out.println("Enter Elements");
		for(int i = 0;i<a.length;i++)
		{
		a[i]=sc.nextInt();	
		}
		System.out.println("Enter Key");
		int key = sc.nextInt();
		
		for(int i = 0;i<a.length;i++)
		{
			
			for(int j = i;j<a.length;j++)
			{
				if(a[i]+a[j]==key && i!=j)
				{
					System.out.println(a[i]+" index at "+i+" Binary "+binary(a[i])+"\n"+a[j]+" index at "+j+" Binary "+binary(a[j]));
					System.out.println("----------------------------------");
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("There are no such elements");
		}
			
	}

}
