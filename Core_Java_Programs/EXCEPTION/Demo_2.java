class Demo_2
{
	public static void main(String[] args)
	{
	   System.out.println("Main started");
	   System.out.println("hello java");
	   try
	   {
		   System.out.println(5/0);
   	   }
   	   catch(Exception ob)
   	   {
		   ob.printStackTrace();
	   }
	   System.out.println("hi");
	   System.out.println("Good morning");
	   System.out.println("End of main");
	}
}