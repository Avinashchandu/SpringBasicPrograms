package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class NonFibinnoci {
public static void main(String[] args) {
  ArrayList a =  new ArrayList();
  
  int count = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Digit");
  int n = sc.nextInt();
  int temp = 0;
	int n1 = 0;
	int n2 = 1;
	a.add(n1);
	a.add(n2);
	for(int i = 0;i<n/2;i++)
	{
		temp = n1+n2;
		n1=n2;
		n2=temp;
		a.add(temp);
		
	}
	for(int i = 0;i<n;i++)
	{
		if(!a.contains(i))
		{
			System.out.println(i);
			count++;
		}
		
}
	if(count==0)
	{
		System.out.println("No Elements Present");
	}
	

}
}