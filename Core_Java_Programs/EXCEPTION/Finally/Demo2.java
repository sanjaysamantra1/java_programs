// It will not execute finally block.
// The program will be terminated after System.exit() statement

class Demo2
{
	public static void main(String[] args)
	{
		try
		{
			 System.out.println("I am in try block");
			 System.exit(1);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("I am in finally block!!!");
		}
	}
}
