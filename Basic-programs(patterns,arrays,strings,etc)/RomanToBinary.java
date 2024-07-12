package assignment;

import java.util.Scanner;

public class RomanToBinary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Roman");
	String s = sc.next();
	int n =RomanToNumeral.convertRomanToInt(s);
	System.out.println(IntToBinary.binary(n));
}
}
