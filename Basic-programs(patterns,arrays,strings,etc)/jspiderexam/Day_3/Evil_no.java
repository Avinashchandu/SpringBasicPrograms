package Day_3;

import java.util.Scanner;

public class Evil_no {
	public static void evil(int n)
	{
		StringBuilder s1 = new StringBuilder();
		int count = 0;
		int temp = n;
		while(n!=0)
		{
			int rem =n%2;
			s1.append(rem);
			if(rem==1)
				count++;
			n=n/2;
			
		}
		if(count%2==0)
			System.out.println("evil no "+" binry - "+s1.reverse());
		else
			System.out.println("Not evil no"+" binary - "+s1.reverse());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		int count = 0;
		int temp = n;
		System.out.println((char)('a'-32));
		evil(n);
	}
}
