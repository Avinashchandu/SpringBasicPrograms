
class pattern201
{
	public static void main(String[] args) 
	{
		int n = 5;
		int y = 2*n-1;
		int star = n-1;
		int space = 0;
		for (int i = 0;i<n ;i++)
		{
			if(i==0)
				System.out.print("*".repeat(9));
			for (int j = 4;j!=0 ;j-- )
			{
				System.out.print("*".repeat(j));
				System.out.print("*".repeat(space));
				System.out.print("*".repeat(j));
			}
			space = space +2;
			System.out.print("");
		}
	}
}
