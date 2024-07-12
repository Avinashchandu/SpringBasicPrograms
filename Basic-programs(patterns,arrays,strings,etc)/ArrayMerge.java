package basic;

public class ArrayMerge {
	public static boolean isPrime(int a)
	{
		int count = 0;
		boolean res = true;
		for(int i = 2;i<a/2;i++)
		{
			if(a%i==0)
			{
				res = false;
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int count = 0;
		int a[] = {1,1,3,4,5};
		int b[] = {7,7,8,11,10};
		int c[] = new int[a.length];
		for(int i = 0;i<a.length;i++)
		{
			if(isPrime(a[i])&&i%2==0)
			{
				c[count++]=a[i];
			}
		}
		for(int i = 0;i<b.length;i++)
		{
			if(isPrime(b[i])&&i%2==0)
			{
				c[count++]=b[i];
			}
		}
		int d[] = new int[count];
		for(int i = 0;i<count;i++)
		{
			d[i]=c[i];
		}
		for(int i = 0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		
		
		
		
	}
}
