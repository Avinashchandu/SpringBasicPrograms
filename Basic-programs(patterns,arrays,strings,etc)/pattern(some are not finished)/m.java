/*
      * *       * *
   * * * *    * * * *
 * * * * * * * * * * *
   * * * * * * * * *
     * * * * * * *
       * * * * *
         * * *
           *
*/
class  m 
{
	public static void main(String[] args) 
	{
		int spaces = 3;
		int star = 3;
		for (int i = 1;i<3 ;i++ )
		{
			for (int j = 1;j<spaces ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 1;j<star ;j++ )
			{

				System.out.print(" *");
			}
				for (int j = 1;j<spaces ;j++ )
			{
				System.out.print("   ");
			}
				for (int j = 1;j<star ;j++ )
			{
				System.out.print(" *");
			}
			System.out.println();
			spaces--;
			star+=2;
			
		}
			int n =6;
			int y = 2*n-1;
			for (int i = 1;i<=n ;i++ )
		{
			for (int j = 1;j<i ;j++ )                              
			{
				System.out.print("  ");
			}
			for (int k = 1;k<=y;k++ )
			{
				System.out.print(" *");
			}
			System.out.println("");
			y-=2;
		}
	}
}
