package assignment;

public class DecimalToRoman {
public static void main(String[] args) {
	int num = 20;
	int a[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	String b[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	StringBuilder s = new StringBuilder();
	for(int i = 0;i<b.length;i++)
	{
		while(num>=a[i])
		{
			num-=a[i];
			s.append(b[i]);
		}
	}
	System.out.println(s);
}
}
