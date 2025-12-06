class FirstNonRepeatedCharacter {

public static void main(String[] args) {

	String str = "entertainment";

	for (int i = 0; i < str.length(); i++)
	{
		char c = str.charAt(i);
		if (str.indexOf(c) == str.lastIndexOf(c)) {
		System.out.println("the first non repeated character is: " + c);
		break;
	 }
   }
}
}