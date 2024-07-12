package day_4;

import java.util.Scanner;

public class ThreadClass extends Thread{
	
	 public void run()
	{
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s = sc.next();
		char[] a = s.toCharArray();
		System.out.println("Enter String 2");
		String s1 = sc.next();
		char b[] = s1.toCharArray();
		if(s.length()!=s1.length())
		{
			System.out.println("Not an anagram");
		}
		else
		{
			for(int i =0;i<a.length;i++)
			{
				for(int j = i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						char t = a[i];
						a[i]=a[j];
						a[j]=t;
					}
					if(b[i]>b[j])
					{
						char t = b[i];
						b[i]=b[j];
						b[j]=t;
					}
				}
			}
			int count = 0;
			for(int i = 0;i<a.length;i++)
			{
				if(a[i]!=b[i])
					count++;
			}
			if(count>0)
			{
				System.out.println("Not an anagram");
			}
			else {
				System.out.println("Anagram");
			}
		}
		
		
	}

}
