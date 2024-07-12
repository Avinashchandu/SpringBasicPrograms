package basic;

import java.util.Scanner;

public class BinaryToString {
	 
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Number");
	  int n = sc.nextInt();
	  int count = 0;
	  int sum = 0;
	  while(n!=0)
	  {
		  
		sum = sum +(int)((n%10)*Math.pow(2.0,count++));
		 n=n/10;
	  }
	  System.out.println(sum);
	  
	  
	
}
}
