// finally block is executed before  return

class Demo1 
{
	public static void main(String[] args) 
	{
		try
		{
			return;
		}
		finally
		{
			System.out.println("finally executed");
		}
		
	}
}
