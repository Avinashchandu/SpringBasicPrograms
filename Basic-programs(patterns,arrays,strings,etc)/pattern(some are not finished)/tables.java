class tables
{
	public static void main(String[] args) 
	{
		
		for (int i = 1;i<=9;i++)
		{
			int count = 2;
			while(count<=11)
			{
				if(count*i<100)
					System.out.print(count + " X "+i+" = "+" "+(count*i)+"\t");
				else
					System.out.print(count + " X "+i+" = "+(count*i)+"\t");
				count++;
			}
			System.out.println();
		}
	}
}
-