
/*
*                 *
**               **
***             ***
****           ****
*****         *****
******       ******
*******     *******
********   ********
********* *********
*******************
*/

class pattern575 
{
	public static void main(String[] args) 
	{
		int n = 10;
		int star = 1;
		int space = 2*n-3;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=star ;j++ )
			{
				System.out.print("*");
			}
			for (int j = 1;j<=space ;j++ )
			{
              System.out.print(" ");
			}
			for (int j = 1;j<=star ;j++ )
			{
				if (j!=n)
				{
				
              System.out.print("*");
				}
			}
			space-=2;
			star++;
			System.out.println();

		}

	}
}
