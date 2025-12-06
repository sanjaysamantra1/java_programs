class Test2 
{
	public static void main(String[] args) 
	{
		String[] argh={"X","Y","Z"};
		args=argh;

		for(String i:args)
		 System.out.println(i);
	}
}

// java Test2 A B C
// java Test2 A B 
// java Test2 
