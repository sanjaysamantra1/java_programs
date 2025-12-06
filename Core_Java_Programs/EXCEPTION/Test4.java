
class Test4
{
	static int i=5;
	  static int j=0;
	  static int x;
	public static void main(String[] args)
	{

		try
		{
		 x=i/j;
		 }
		finally
		{
	      System.out.println("X= "+x);
	      System.out.println("End of main");
	     }
	}
}