class Patpro 
{
	public static void main(String[] args) 
	{
		int row = 3;
		for (int i = 1;i<=3;i++ )
		{
			
			for (int j = 1;j<=3 ;j++ )
			{
				if (i+j==3 || i+j == 5)
				{
				System.out.print(" $");
				}
				else
				System.out.print(" *");
			    }
			System.out.println();
	}
}
}
