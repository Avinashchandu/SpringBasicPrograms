package assignment;

import java.util.Scanner;

public class Octal {
	
	public static int octal(int m)
	{
	   String s = new String();
	   while(m>0)
	   {
		   s+=(m%8);
		   m=m/8;
	   }
	   String s1 = new String();
	   for(int i =s.length()-1;i>=0;i--)
	   {
		   s1+=s.charAt(i);
	   }
	   int i =Integer.parseInt(s1);
	   return i;
	   
	}
		public static int binary(int n)
		{
			String s = String.valueOf(n);
			int sum = 0;
			int count = s.length()-1;
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i)=='1')
				{
					sum+=Math.pow(2,count);
				}
				count--;
			}
			//System.out.println(sum);
			return sum;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number");
			int n=sc.nextInt();
			int num =binary(n);
			System.out.println(octal(num));
			
		}
}

