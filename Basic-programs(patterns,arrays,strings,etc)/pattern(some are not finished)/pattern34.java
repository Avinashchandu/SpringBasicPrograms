class pattern34 
{
	public static void main(String[] args) 
	{

		int n = 15;
		int space =1 ;
		int star =n/2 ;
		
		for (int i = 1;i<=n ;i++ )
		{
			if (i==1 || i== n)
				{
		
			for (int  j = 1 ;j<=n ;j++ )
			{
				System.out.print("* ");
				
			}
			}
			else
				{
				for (int j = 1;j<=star ;j++ )
				{
					System.out.print("* ");
				}
				for (int j = 1;j<=space ;j++ )
				{
					System.out.print("  ");
				}
				for (int j = 1;j<=star ;j++ )
				{
					System.out.print("* ");
				}
				if(i<=n/2)
				{
					star--;
					space+=2;
				}
				else
				{
					star++;
					space-=2;
				}
				
				}
				System.out.println();
				
			}
		}
	}