//StackOverflowError

class ErrorDemo2{
	public static void doOne(int x)
	{
		doTwo(x);
	}
	public static void doTwo(int y)
	{
		doThree(y);
	}
	public static void doThree(int z)
	{
		doTwo(z);
	}
	public static void main(String args[])
	{
		doOne(5);
	}
}