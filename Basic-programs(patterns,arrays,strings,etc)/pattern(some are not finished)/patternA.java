class patternA 
{
	public static void main(String[] args) 
	{
		int space = 2;
		int star = 1;
		for (int i = 0;i<3 ;i++ )
		{
			char a ='A';
			for (int j = 1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 1;j<=star ;j++ )
			{
				System.out.print(a+++" ");
			}
			space--;
			star = star + 2;
			
			System.out.println();
		}
	}
}
