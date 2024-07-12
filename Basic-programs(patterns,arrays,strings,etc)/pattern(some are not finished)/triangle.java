class triangle 
{
	public static void main(String[] args) 
	{
		int r = 7;
		int n = 1;
		int count = 1;
		for (int i = 0;i<r;i++ )
		{
			for (int j = 0 ;j<r-i ;j++ )
			{
				System.out.print("*");
			}
			count = 1;
			while(count<n)
			{
				System.out.print(" ");
					count++;
			}
			n = n+2;
			for (int j = 0 ;j<r-i ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
