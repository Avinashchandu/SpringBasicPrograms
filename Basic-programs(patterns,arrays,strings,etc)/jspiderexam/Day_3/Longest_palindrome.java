package Day_3;

import java.util.Scanner;

public class Longest_palindrome {

	public static boolean palindrome(String s)
	{
		String r = new String();
		for(int i = s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==' ')
				continue;
			r+=s.charAt(i);
			
		}
		if(r.equals(s))
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		boolean status = false;
		int max = 0;
		String max1="";
		for(int i =0;i<s.length();i++)
		{
			for(int j =i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
				status = palindrome(s.substring(i, j+1));
				}
				if(status == true)
				{
					if(max<s.substring(i, j+1).length())
					{
						max=s.substring(i, j+1).length();
						max1 =s.substring(i, j+1);
					}
					status = false;
				}
			}
		}
		System.out.println(max);
		System.out.println(max1);
	
	}
}
