package day_5;

import java.util.Random;
import java.util.Scanner;

public class Randomno {
	public static void random(int n)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("enter number");
			int m = sc.nextInt();
			if(m==n)
			{
				System.out.println("You did it,You found the number");
				break;
			}
			else if(m>n)
				System.out.println("Too High,Try Again");
			else
				System.out.println("Too Low,Try Again");
			
		}
	}
	public static void main(String[] args) {
		Random n = new Random();
		int m = n.nextInt(0, 1000);
		random(m);
		
		
	}
	

}
