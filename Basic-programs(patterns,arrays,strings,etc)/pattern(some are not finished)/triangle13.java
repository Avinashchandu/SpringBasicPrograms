class triangle13 
{
	public static void main(String[] args) 
	{
		int n =5;
		int space = 4;
		//int n = 2*rows-1;
		int star = 1;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<space ;j++ )
			{
				System.out.print(" ");
			}
			for (int j = 0;j<star ;j++ )
			{
				System.out.print(" *");
			}
			if(i<n/2)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
		System.out.println("");
		}
		
}
}