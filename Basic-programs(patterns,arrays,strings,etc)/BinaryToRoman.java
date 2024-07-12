package assignment;
//Incomplete
import java.util.Scanner;

public class BinaryToRoman {
	public static void main(String[] args) {
	System.out.println("Enter Binary code");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	String s = String.valueOf(n);
	int sum = 0;
	int count = s.length()-1;
	for(int i = 0;i<s.length();i++)
	{
		if(s.charAt(i)=='1')
		{
			sum+=Math.pow(2,count);
		}
		count--;
	}
	int num =sum;
	String a[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	int b[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	StringBuilder s1 = new StringBuilder();
	for(int i = 0;i<a.length;i++)
	{
		while(num>=b[i])
		{
			num-=b[i];
			s1.append(a[i]);
		}
	}
	System.out.println(s1);
	}

}
