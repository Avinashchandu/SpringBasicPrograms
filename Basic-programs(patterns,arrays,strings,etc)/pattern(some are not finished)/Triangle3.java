class Triangle3
{
	public static void main(String[] args) 
	{
		int n = 14;
		int y = 2*n-1;
		int c=n;
		for (int i = 1;i<=y ;i++ )
		{
			if (i<=n)
			{
			for (int j = 1;j<=i ;j++ )
			{
				System.out.print(" *");
			}
			}
			else
			{
		     	for (int j = 1;j<c;j++ )
			{
				System.out.print(" *");
			}
			c--;
			}
			
            System.out.println();
			}

		}
	}
