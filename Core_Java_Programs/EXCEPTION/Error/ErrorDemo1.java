//StackOverflowError

class ErrorDemo1{
	public static void counter(int i)
	{
		counter(++i);
	}
	public static void main(String args[])
	{
		counter(5);
	}
}