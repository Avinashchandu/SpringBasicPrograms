class Without_divison 
{
	public static void main(String[] args) 
	{
		int num = 100;
		int div = 5;
		int count = 0;
		while(num>=div)
		{
			num = num - div;
			count++;
		}
		System.out.println(num +"  -remainder");
		System.out.println(count +"  -quotient");

	}
}