package assignment;

public class RomanToDecimal {
public static void main(String[] args) {
	String s ="XXIV";
	int sum =0;
	int a[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	String b[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	for(int i =0;i<s.length();i++)
	{
		if(i!=s.length()-1)
		{
		String s1 = s.substring(i, i+1);
		for(int j = 0;j<b.length;j++)
		{
		if(s1.equals(b))
		{
			sum+=a[j];
			i+=2;
		}
     	}
		}
		String s2 = s.substring(i, i);
		for(int j = 0;j<b.length;j++)
		{
		if(s2.equals(b))
		{
			sum+=a[j];
			i+=1;
		}
     	}
	}
	System.out.println(sum);
}
}
