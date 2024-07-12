class Without_divison 
{
	public static void main(String[] args) 
	{
		int num = 15;
		int div = 2;
		int count = 0;
		int quotient = 0;
		int remainder = 0;
		while(num>=div)
		{
			num = num - div;
			count++;
		}
		System.out.println(num +"  -remainder");
		System.out.println(count +"  -quotient");

	}
}
