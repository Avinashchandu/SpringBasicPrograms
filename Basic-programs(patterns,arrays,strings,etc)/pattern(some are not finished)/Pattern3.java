class Pattern3 
{
	public static void main(String[] args) 
	{
		char a = 'A';
		int count = 1;
		for (int i = 1;i<=4 ;i++ )
		{
			for (int j = 1;j<=4 ;j++ )
			{
				if(i%2==0)
					System.out.print(" "+a++);
				else
					System.out.print(" "+count++);
			}
			System.out.println(" ");
		}
	}
}
