class PatternMAlp 
{
	public static void main(String[] args) 
	{
		int rows = 4;
		int col = 3;
		int s =1;
		char ch = 'a';
		for (int i =0;i<rows ;i++ )
		{
			for (int j =0;j<col ;j++ )
			{
				System.out.print(" "+ch);
				ch++;
			}
			for (int j =0;j<s ;j++ )
			{
				if (j==0)
				{
					if(j==s-1)//
						break;
					System.out.print(" "+ch);
					ch++;
				}
				else
				{
				System.out.print("  ");
				}
			}
			for (int j=0;j<=col ;j++ )//
			{

				System.out.print(" "+ch);
				ch++;
			}
			System.out.println();
		s++;
		col--;

		}
		
	}
}
