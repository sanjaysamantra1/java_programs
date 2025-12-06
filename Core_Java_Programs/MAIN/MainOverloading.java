class MainOverloading
{
	public static void main()
	{
	  System.out.println("main() of class main1");
	}

	public static void main(String s)
	{
	  System.out.println("main(String s) of class main1");
	}

	public static void main(int i[])
	{
	  System.out.println("main(int i[]) of class main1");
	}

	public static void main(String args[])
	{
	  System.out.println("Begining of main(String args[])");
	  main();
	  main("example");
	  main(new int[2]);
	  System.out.println("End of main(String args[])");
	}

	public static void main(Object args)
	{
	  System.out.println("main(object args) of class main1");
	}
}

