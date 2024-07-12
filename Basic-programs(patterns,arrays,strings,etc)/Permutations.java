package basic;

import java.util.Scanner;

public class Permutations {
	public static int factorial(int n)
	{
		int mul = 1;
		for(int i = 1;i<=n;i++ )
		{
		 mul*=i;	
		}
		return mul;
	}
 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter n");
	  int n = sc.nextInt();
	  System.out.println("ENter r");
	  int r = sc.nextInt();
	  System.out.println("Permutation "+(int)(factorial(n)/factorial(n-r)));
	  System.out.println("Combinations "+(int)(factorial(n)/(factorial(r)*factorial(n-r))));
}
}
