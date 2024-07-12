package basic;

import java.util.Scanner;

public class Gcd {
	public static int[] sort(int[] a)
	{
		for(int i = 0;i<a.length;i++)
		{
			int temp = 0;
			for(int j = i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a;

	}
 public static void main(String[] args) {
	 int num = 1;
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of array");
	int sz = sc.nextInt();
	int a[]=new int[sz];
	System.out.println("Enter the Elements");
    for(int i =0;i<sz;i++)
    {
    	a[i]=sc.nextInt();
    }
    a = sort(a);
    for(int i = 1;i<=a[0];i++)
    {
    	int count = 0;
    	for(int j = 0;j<a.length;j++)
    	{
    		if(a[j]%i==0)
    		{
    			count++;
    		}
    		else
    		{
    			break;
    		}
    	if(count==a.length)
    	{
    		num=i;
    	}
    		
    	}
    }
    System.out.println(num);
	
}
}
