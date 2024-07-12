class singer
{
	public static void main()
	{
		MainClassOV.main(1);
	}
}
class MainClassOV 
{
	public static void main(int a )
	{
		System.out.println("This is another Main");

	}
	public static void main(String[] args) 
	{
		System.out.println("This is Main");
		singer.main();
		main(1);
	}
}
