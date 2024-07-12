package Day_3;

import java.util.Scanner;

public class Rearrangement {
    public static void rearrange(int a[])
    {
    	for(int i =0;i<a.length;i++)
    	{
    		
    		if(i>=a.length-2)
    			break;
    		int temp = 0;
    		//System.out.println(i);
    		if(a[i]>a[i+1])
    		{
    			temp = a[i+1];
    		    a[i+1]=a[i];
    		    a[i]=temp;
    		}
    		temp =0;
    		if(a[i+2]>a[i+1])
    		{
    		    temp = a[i+1];
    		    a[i+1]=a[i+2];
    		    a[i+2]=temp;
    		}
    		i=i+1;
    	}
    	System.out.print("{");
    	for(int i = 0;i<a.length;i++)
    	{
    		System.out.print(a[i]+",");
    	}
    	System.out.print("}");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int sz = sc.nextInt();
		int a[] = new int[sz];
		System.out.println("Enter Numbers");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		rearrange(a);
		
	}
}
