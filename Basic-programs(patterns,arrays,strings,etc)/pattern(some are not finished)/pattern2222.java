
/*
      a
    b 1 c
  d 2 e 3 f
g 4 h 5 i 6 j
  k 7 l 8 m
    n 9 o
      p
*/
class pattern2222 
{
	public static void main(String[] args) 
	{
		int n = 7;
		int star =1;
		int space = n/2;
		char a = 'a';
		int b =1;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 1;j<=star ;j++ )
			{
				if(j%2!=0)
					System.out.print(a+++" ");
				else
					System.out.print(b+++" ");
			}
			if(i<n/2+1)
			{
			space--;
			star+=2;
			}
			else
			{
            space++;
			star-=2;
			}
System.out.println();
			
			
		}
	}
}
