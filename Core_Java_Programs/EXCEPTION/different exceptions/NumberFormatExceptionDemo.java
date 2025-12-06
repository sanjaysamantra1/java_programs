class NumberFormatExceptionDemo
{
	public static void main(String[] args)
	{
		String s1="10";
		int a=Integer.parseInt(s1);
		System.out.println(a);

		String s2="20 ";
		int b=Integer.parseInt(s2);
		System.out.println(b);
    }
}