
/*
*                                       *
* *                                   * *
* * *                               * * *
* * * *                           * * * *
* * * * *                       * * * * *
* * * * * *                   * * * * * *
* * * * * * *               * * * * * * *
* * * * * * * *           * * * * * * * *
* * * * * * * * *       * * * * * * * * *
* * * * * * * * * *   * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * *   * * * * * * * * * *
* * * * * * * * *       * * * * * * * * *
* * * * * * * *           * * * * * * * *
* * * * * * *               * * * * * * *
* * * * * *                   * * * * * *
* * * * *                       * * * * *
* * * *                           * * * *
* * *                               * * *
* *                                   * *
*   
 */

class butterfly 
{
	public static void main(String[] args) 
	{
		int n = 21;
		int star = 1;
		int space = n-2;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<=star ;j++ )
			{
				System.out.print("* ");
			}
			for (int j = 1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 1;j<=star ;j++ )
			{
				if(i==n/2+1&&j==star)
					break;
				System.out.print("* ");
			}
			if (i<n/2+1)
			{
				star++;
				space-=2;
			}
			else
			{
				star--;
				space+=2;
			}
			System.out.println(" ");

		}
	}
}
