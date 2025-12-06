class ReturnTest
{
	public final static void main(String args[])
	{
		System.out.println(m1());
	}
	private static int m1()
	{
		try
		{
			System.out.println(6/0);
		}
		catch(Exception e)
		{
			return 8;
		}
		finally
		{
			return 7;
		}
	}
}