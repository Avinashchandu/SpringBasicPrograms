class number 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int y = 2*n-1;
		int spaces = n-1;
		int star = 1;
		for (int i = 1;i<=y;i++ )
		{
			for (int j = 1 ;j<=spaces ;j++ )
			{
				System.out.print(" ");
			}
			for (int j = 1 ;j<=star ;j++ )
			{
				System.out.print("*");
			}
			if(i<y/2+1)
			{
			star++;
			spaces--;
			}
			else
			{
				star--;
				spaces++;
			}
			System.out.println("");
		}
	}
}
