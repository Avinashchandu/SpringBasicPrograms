//14837,14857,14969
class Main 
{
	static int count =0;
	public static void main1()
	{ 
		
		System.out.println(count++);
		main2();
		
	}
	public static void main2()
	{
		System.out.println(count++);
		main1();
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
		main1();
	}
}