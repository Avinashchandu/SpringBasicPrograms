package basic;

import java.util.Scanner;

public class Fibinnoci {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int temp = 0;
	int n1 = 0;
	int n2 = 1;
	System.out.println("Enter No of digits");
	int n = sc.nextInt();
	System.out.println(n1);
	System.out.println(n2);
	for(int i = 0;i<n-2;i++)
	{
		temp = n1+n2;
		n1=n2;
		n2=temp;
		System.out.println(temp);
		
	}
}
}
