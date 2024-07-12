class primeno 
{
	public static void main(String[] args) 
	{   int count = 1;
	    int c = 0;
		int j = 2;
		for (int i = 0;i<3  ;i++ )
		{
			count = 1;
			for(int z = 1;z<=100;z++)
			{
				if(count>3)
					break;
				c = 0;
				for (int k = 2;k<j/2+1 ;k++ )
				{
					if (j%k==0)
					{
						c=c+1;
					}
				}
				if (c==0)
				{
					
					count++;
					if (j<9)
					{
						System.out.print((String)("0"+j));
						System.out.print("  ");
					}
					else
					{
						System.out.print(j);
						System.out.print("  ");
					}
				}
				j++;
			}
			System.out.println("");
		}
	}
}
