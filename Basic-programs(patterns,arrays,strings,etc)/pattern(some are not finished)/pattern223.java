
/*
a b c d e f g
h i j   k l m
n o       p q
r           s
*/
class pattern223
{
	public static void main(String[] args) 
	{
		int star = 6;
		int space = 0;
		int temp = star;
		char a = 'a';
		for (int i =1 ;i<=star ;i++ )
		{
			for (int j = 1;j<=temp ;j++ )
			{
				System.out.print(a+++" ");
			}
			if (i==2)
				{
					space = 1;
				}
			for (int j = 1;j<=space ;j++ )
			{
				
				System.out.print("  ");
			}
			for (int j = 1;j<=temp ;j++ )
			{
				if(i==1 && j==temp)
					break;
				System.out.print(a+++" ");
			}
			if (i!=1)
			{
				space+=2;
			}
			
			temp--;
			System.out.println();



		}


	}
}
