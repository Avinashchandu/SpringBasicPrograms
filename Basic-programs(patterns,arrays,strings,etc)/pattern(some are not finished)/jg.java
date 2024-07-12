class jg 
{
	public static void main(String[] args) 
	{
		int count = 5;
		for (int i = 1;i<=5;i++ )
		{
			
			for (int j = 1;j<=5 ;j++ )
			{
				if (i+j==8 || i+j==4 || i+j==6)
				{
				System.out.print("*");
				}
				System.out.print("  ");

			    }
				count--;
			System.out.println();
		}
	}
}
