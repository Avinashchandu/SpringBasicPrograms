package assignment;

import java.util.Scanner;

public class IntToBinary {

	public static String binary(int n)
	{
		String s = new String();
		String s1 = new String();
		while(n!=0)
		{
			s=s+n%2;
			n=n/2;
		}
		for(int i = s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		return s1;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the No");
	int n = sc.nextInt();
	String s = binary(n);
	System.out.println(s);
}
}
