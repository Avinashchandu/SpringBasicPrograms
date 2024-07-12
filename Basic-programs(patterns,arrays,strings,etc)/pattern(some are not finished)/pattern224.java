class pattern224 
{
	public static void main(String[] args) 
	{
		int star = 5;
		int n = star;
		int space =0;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j = 1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			if(i<n/2+1)
			{
			star-=2;
			space++;
			}
			else
			{
			star+=2;
			space--;
			}
			

			System.out.println(" ");

		}
		
	}
}
