package assignment;

import java.util.Scanner;

public class BinaryToInt {
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
		return sum;
	}
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();
	System.out.println(binary(n));
}
}
