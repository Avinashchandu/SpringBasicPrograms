class pattern20
{
	public static void main(String[] args) 
	{
		int n = 5;
		int y = 2*n-1;
		int star = n-1;
		int space = 0;
		for (int i = 1;i<=n ;i++)
		{
			for (int j = 0;j<=y ;j++ )
			{
				if(i==0)
				{
					System.out.print("*");
				}
				if (j<star)
				{
					System.out.print("*");
				}
				

			}
			star--;
		}
	}
}
