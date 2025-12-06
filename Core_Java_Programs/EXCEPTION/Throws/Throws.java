/*
for checked exceptions either 1. try..catch
						   or 2. throws
otherwise C.E

to delegate responsibility of exception handling to the caller method
not for unchecked Exceptions
*/

class Throws{
	public static void main(String args[])throws Exception
	{

		System.out.println("hello");

		Thread.sleep(5000);

		System.out.println("hi");
	}
}