class Pattern9 
{
	public static void main(String[] args) 
	{
		int rows = 10;
		int n = rows;
		for (int i = 1;i<=rows ;i++ )
		{
		
		for (int j = 1;j<=rows ;j++ )
			{
			    if (j>=n)
			    {
			    
				System.out.print(" *");
				}
				else
					System.out.print("  ");

			}
			n=n-1;
System.out.println(" ");
		}
	}
}
