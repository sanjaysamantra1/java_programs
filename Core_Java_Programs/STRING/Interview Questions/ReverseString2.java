class ReverseString2
{
	public static void main(String[] args)
	{
		String s = new String("SACHIN");

		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));

		System.out.println();
	}
}
