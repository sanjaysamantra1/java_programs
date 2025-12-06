class throwDemo1
{
	public static void main(String arg[])
	{
		//System.out.println(5/0);

		int x=3;

		if(x<5){
			ArithmeticException ob = new ArithmeticException ("/ by zero...!");
			throw ob;
		}
		else
			throw new NullPointerException("this is nullpointer exception");

	}
}

/*we can create Exception object explicitly and hand–over that object to the JVM programmatically by
throw key –word */