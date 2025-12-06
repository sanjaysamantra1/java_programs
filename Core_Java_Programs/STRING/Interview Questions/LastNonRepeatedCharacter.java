class LastNonRepeatedCharacter
{
	public static void main(String[] args)
	{
		String arr = "ENTERTAINMENT";

		for (int i = arr.length() - 1; i >= 0; i--)
		{
			char c = arr.charAt(i);
			if (arr.indexOf(c) == arr.lastIndexOf(c))
			{
				System.out.println("the last non repeated character is: " + c);
				break;
			}
		}
	}
}