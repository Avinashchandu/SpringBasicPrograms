class triangle12 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int space = n-1;
		int star = 1;
		int y = 2*n-1;
		for (int = 1;i<y;i++ )
		{
			for (int j = 1;j<=space;j++ )
			{
				System.out.println(" ");
			}
			for (int j = 1;j<=star;j++ )
			{
				System.out.println(" *");
			}
			if(i<y/2)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}

			
		}
	}
}
