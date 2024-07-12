package day_5;

import java.util.Scanner;

public class BuzzNo {
	public static void buzz(int m)
	{
		if((m%10)==7 || m%7==0 )
			System.out.println("Buzz No");
		else
			System.out.println("not A buzz no");
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no");
		int n = s.nextInt();
	    buzz(n)	;
    }
}
