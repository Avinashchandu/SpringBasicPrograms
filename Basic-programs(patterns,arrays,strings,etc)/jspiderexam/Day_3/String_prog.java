package Day_3;

import java.util.Scanner;

public class String_prog {
	public static void sentence(String s)
	{
		String s1 ="";
		int m =0;
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				s1+=swap(s.substring(m,i));
				s1+=' ';
				m=i+1;
			}
			if(i==s.length()-1)
			{
				s1+=swap(s.substring(m));
				s1+=' ';
			}
		}
		System.out.println(s1);
	}
	public static String swap(String s)
	{
		//System.out.println(s);
		String rev = "";
		int m = 0;
		int n = 0;
		int count = 0;
		char c[]=s.toCharArray();
		for(int i = 0;i<c.length;i++)
		{
	
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
			{
				if(count == 0)
				{
					m=i;
					count++;
				}
				else
				{
					n=i;
					count++;
				}
				if(count==2)
				{
				   char temp = (char)(c[m]-32);
				   c[m] = (char)(c[n]-32);
				   c[n] = temp;
				   m=0;
				   n=0;
				   count = 0;
				}
			}
		}
		for(int i =0;i<c.length;i++)
		{
			rev+=c[i];
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		sentence(s);
		
		
	}

}
