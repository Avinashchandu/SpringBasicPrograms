package day_2;

import java.util.Scanner;

public class repeating_letters {
	
	public static int repeat(String s)
	{
		System.out.println(s);
		int count = 0;
		for(int i =0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)!=' ')
			{
				count++;
				System.out.print(s.charAt(i));
				while(s.charAt(i)==s.charAt(i+1))
				{
					System.out.print(s.charAt(i));
					i=i+1;
				}
				System.out.println();
			}
		}
		return count;
	}
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		s=s.toLowerCase();
		//.3.+System.out.println(s);
		System.out.println("COUNT "+repeat(s));
				
		
	}
}
