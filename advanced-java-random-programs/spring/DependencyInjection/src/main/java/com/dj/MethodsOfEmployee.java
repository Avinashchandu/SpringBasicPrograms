package com.dj;

public class MethodsOfEmployee {
	
	static int m(int i)
	{
		int next = 0;
		while(i!=0)
		{
			int rem = i%10;
			rem+=1;
			next = next*10+rem;
			i=i/10;
		}
		i = next;
		next = 0;
		while(i!=0)
		{
			int rem = i%10;
			next = next*10+rem;
			i=i/10;
		}
		
		return next;
	}
	static String T0Up(String s)
	{
		char a[] = s.toCharArray();
		String s1 ="";
		for(int i =0;i<s.length();i++)
		{
			if(a[i]<'a')
				continue;
			a[i]=(char) (a[i]-32);
		}
		for(int i =0;i<s.length();i++)
		{
			s1+=a[i];
		}
		
		return s1;
		
	}
	static String NextChar(String s)
	{
		char a[] = s.toCharArray();
		String s1 ="";
		for(int i =0;i<s.length();i++)
		{
			if(a[i]=='z')
			{
				a[i]='a';
				continue;
			}
			
			a[i]=(char) (a[i]+1);
		}
		for(int i =0;i<s.length();i++)
		{
			s1+=a[i];
		}
		
		return s1;
		
	}
public static void main(String[] args) {
	System.out.println(m(788));
	System.out.println(T0Up("avinash"));
	
	
}
}
