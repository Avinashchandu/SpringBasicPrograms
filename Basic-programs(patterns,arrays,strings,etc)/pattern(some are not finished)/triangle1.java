class triangle1 
{
	public static void main(String[] args) 
	{
		int r = 14;
		int n = 1;
		for (int i = 0;i<r;i++ )
		{
			for (int j = 0 ;j<=r-i ;j++ )
			{
				System.out.print(" ");
			}
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print("*");
			}
			n= n+2;
			
			System.out.println();
		}
	}
}
