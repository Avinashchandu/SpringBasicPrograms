package basic;

import java.util.Scanner;


public class Arrayp1 {
	public static int[] array(int size,int temp)
	{
		int b[] = new int[size];
		size = size - 1;
		while(temp!=0)
		   {
			   b[size--] = temp%10;
			   temp = temp/10;
		   }
		return b;
		
	}
    public static void main(String[] args) {
	   System.out.println("Enter Number");
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int l =0;
	   int temp=n;
	   while(temp!=0)
	   {
		   temp = temp/10;
		   l++;
	   }
	   int b[]=array(l,n);
	   for(int i =0;i<b.length;i++)
	   {
		   System.out.println(b[i]);
	   }
	   
	   
	   
	   
	}
}
