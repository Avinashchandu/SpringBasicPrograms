
/*
 * * * *
 * * *
 * *
 *
 * *
 * * *
 * * * *
 */
 class patternassignment 
{
	public static void main(String[] args) 
	{
		int n = 7;
		int y = 2*n-1;
		for (int i = 1;i<=y ;i++)
		{
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print(" *");
			}
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print(" *");
			}
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print(" *");
			}

			if (i<y/2+1)
			{
				n--;
			}
			else
				n++;
System.out.println();
			
		}
	}
}
