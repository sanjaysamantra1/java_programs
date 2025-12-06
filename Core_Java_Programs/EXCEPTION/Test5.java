
class Test5
{
	static int i=5;
	  static int j=0;
	  static int x;
	public static void main(String[] args)
	{

		try
		{
			x=i/j;

		     try{
			      int a[]=new int[5];
			      a[6]=50;
		        }
		        catch(NullPointerException e)
		        {
				}

		 }
		 catch(Exception e1)
		 {
		 System.out.println("hello");
			 }

	      System.out.println("End of main");

	}
}