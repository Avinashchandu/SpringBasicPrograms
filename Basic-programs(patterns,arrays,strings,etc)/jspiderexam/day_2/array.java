package day_2;

import java.util.Scanner;

public class array {
	public static boolean special(char a)
	{
		if(a>='0'&&a<='9')
			return false;
		if(a>='a'&&a<='z')
			return false;
		if(a>='A'&&a<='Z')
			return false;
		return true;
	}
	public static void reverseArray(char[] s)
	{
		int count = s.length-1;
		char b[] = new char[s.length];
		for(int i =0;i<s.length;i++)
		{
			if(special(s[i]))
			{
				continue;
			}
			else
			{
				while(special(s[count]))
				{
					count--;
				}
				if(special(s[count]))
				{
					b[i]=s[count--];
					
				}
				else
				{
				
				b[i]=s[count--];
				}
			}
		}
		for(int i =0;i<s.length;i++)
		{
			if(special(s[i]))
			{
				b[i]=s[i];
			}
		}
		for(int i =0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
	int sz = sc.nextInt();
	char s[] = new char[sz];
	System.out.println("enter Elements");
	for(int i =0;i<sz;i++)
	{
		s[i]=sc.next().charAt(0);
	}
   reverseArray(s);
}
}
