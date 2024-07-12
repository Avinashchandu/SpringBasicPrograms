package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenIndex {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of digits to be Entered");
		int n = sc.nextInt();
		System.out.println("Enter Numbers");
		for(int i = 0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		for(int i = 0;i<n;i++)
		{
			if(i%2==0)
			System.out.println( a.get(i)+" index - "+i);
			
		}
	}

}
