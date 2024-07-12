package day_4;

import java.util.Scanner;

public class Unit_number {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lamda l = ( m) ->
		{
			int count = 0;
			int temp = m;
			while(m!=0)
			{
				int rem = m%10;
				int n = m/10;
				m=m/10;
				while(n!=0)
				{
					int rem1 = n%10;
					n=n/10;
					if(rem1==rem)
					{
						count = 1;
					}
				}
			}
			if(count==1)
				System.out.println("Not Unique");
			else
				System.out.println("Unique");
		};
		System.out.println("Enter Number");
		int n = sc.nextInt();
		l.uniqueno(n);
		
		
		
	}
	
	
}
