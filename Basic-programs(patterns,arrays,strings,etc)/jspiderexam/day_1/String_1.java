package day_1;

import java.util.Scanner;

public class String_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s  = sc.next();
	char s1[] = s.toCharArray();
	String s2 ="";
	int count = 1;
	int sum =0;
	for(int i=0;i<s.length();i++)
	{
		char key = s1[i];
		for(int j=i+1;j<s.length();j++)
		{
			if(s1[i]==s1[j])
			{
				count+=1;
				if(count==j)
				{
					sum-=1;
					s1[j]='@';
				}
				else
				{
					sum+=j;
					s1[j]=(char)(48+j);
				}
			}
			count = 1;
		}
		
	}for(int i = 0;i<s1.length;i++)
	{
		if(s1[i]=='@')
		{
			s2+="-1";
		}
		if(s1[i]>57&&s1[i]<'a')
		{
			s2+=s1[i]-'0';
			continue;
		}
		s2+=s1[i];
	}
	System.out.println(sum);
	System.out.println(s2);
	
}
}
