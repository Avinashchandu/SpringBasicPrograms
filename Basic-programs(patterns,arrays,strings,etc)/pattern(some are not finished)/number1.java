/*
        10
      8 10
    6 8 10
  4 6 8 10
2 4 6 8 10
  4 6 8 10
    6 8 10
      8 10
        10
*/
class number1  
{
	public static void main(String[] args) 
	{
		int n =20;
		int y = 2*n-1;
		int spaces = n-1;
		int star = 1;
		int num = 2*n;
		int temp = num;
		for (int i = 1;i<=y;i++ )
		{
			for (int j = 1 ;j<=spaces ;j++ )
			{
				System.out.print("   ");
			}
			for (int j = 1 ;j<=star ;j++ )
			{

				if (num<=9)
				{
				
				System.out.print((String)("0"+num)+" ");
				num = num+2;
				}
				else{
					System.out.print(num+" ");
				num = num+2;

				
				}

			}
			num = temp;
			if(i<y/2+1)
			{
			star++;
			spaces--;
			num = num -i*2;
			}
			else
			{
				star--;
				spaces++;
				num = num - star*2+2;
				
			}
			System.out.println("");
		}
	}
}

