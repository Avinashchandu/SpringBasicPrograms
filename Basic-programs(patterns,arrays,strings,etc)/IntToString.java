package assignment;

public class IntToString {
  public static void main(String[] args) {
	int i =123456;
	String s = new String();
	String s1 = new String();
	
	String b ="0";
	int base =b.charAt(0);
	while(i!=0)
	{
		int rem = i%10;
		i=i/10;
		s1+=(char)(rem+base);
	}
	for(int j = s1.length()-1;j>=0;j--)
	{
		s+=s1.charAt(j);
	}
	System.out.println(s);
  }}
	
