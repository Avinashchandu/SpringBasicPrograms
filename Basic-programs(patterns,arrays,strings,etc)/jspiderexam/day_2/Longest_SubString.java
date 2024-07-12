package day_2;

import java.util.Scanner;

public class Longest_SubString {
	
	public static void longest(String s)
	{
		String max ="";
         for(int i = 0;i<s.length();i++)
         {
        	 String s3 ="";
        	 s3+=s.charAt(i);
        	 for(int j = i+1;j<s.length();j++)
        	 {
        		 if(s3.lastIndexOf(s.charAt(j))>=0)
        		 {
        			 if(s3.length()>max.length())
        			 {
        				 max = s3;
        			 }
        			 break;
        		 }
        		 s3+=s.charAt(j);
        	 }
        	
         }
         System.out.println(max);
         
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		longest(s);
		
	
	}
}
