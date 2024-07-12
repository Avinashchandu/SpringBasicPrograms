class Pattern4 
{
	public static void main(String[] args) 
	{
		char a = 'a';
		int count = 1;
		for (int i = 1;i<=4 ;i++ )
		{
			for (int j = 1;j<=4 ;j++ )
			{
				if(count>10)
					count =1;
				if(j%2==0)
				{
					System.out.print(" "+a++);
				
				}
				else
				{
					System.out.print(" "+count++);
					count++;
				}
			}
			System.out.println(" ");
	}
}
}
