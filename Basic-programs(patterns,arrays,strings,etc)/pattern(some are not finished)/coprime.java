//waptc are co prime or not
import java.util.*;
class coprime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		int a = sc.nextInt();
		System.out.println("enter number 2");
		int b = sc.nextInt();
		int count = 0;
		int max = 0;
		if(a>b)
			max=a;
		else
			max = b;
		for (int i = 1;i<max/2+1 ;i++ )
		{
			if(a%i==0 && b%i==0)
				count = i;
		}
		if (count == 1)
		{
			System.out.println("co prime");
		}
		else
			System.out.println("Not co prime");

	}
}
