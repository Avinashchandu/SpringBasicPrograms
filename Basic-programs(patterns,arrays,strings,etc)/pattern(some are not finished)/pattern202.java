class pattern202 
{
	public static void main(String[] args) 
	{
		int space = 3;
		int star = 1;
        int count = 1;
		int temp = count;
		for (int i = 1;i<=4 ;i++ )
		{
			temp = count;
			for (int j = 1;j<=star ;j++ )
			{
				if(count==10)
					count =0;
				System.out.print(count+++" ");
			}
				for (int j = 1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
				count = temp;
				for (int j = 1;j<=star ;j++ )
			{
					if(count==10)
					count =0;
				System.out.print(count+++" ");
			}
				System.out.println();
				star++;
				space--;
		}

	}
}
