class StringSwap
{
	public final static void main(String args[])
	{
		m1();
	}
	private static void m1()
	{
		String s1="hi";
		changeArgs(s1);
		System.out.println(s1);
	}
	public static String changeArgs(String s)
	{
		s="hello";
		return s;
	}

}