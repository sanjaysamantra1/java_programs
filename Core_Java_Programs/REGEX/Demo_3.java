import java.util.regex.*;

class Demo_3
{
	public static void main(String args[])
	{
		System.out.println(Pattern.matches("[amn]", "dbcd"));//false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "m"));//true (among a or m or n)

		System.out.println(Pattern.matches("[a]?", "a"));
		System.out.println(Pattern.matches("[a]?", ""));
		System.out.println(Pattern.matches("[a]?", "aa"));

		System.out.println(Pattern.matches("[a]+", "aa"));
		System.out.println(Pattern.matches("[a]+", "aaaa"));
		System.out.println(Pattern.matches("[a]+", "sdfg"));

		System.out.println(Pattern.matches("[a]*", ""));
		System.out.println(Pattern.matches("[a]*", "a"));
		System.out.println(Pattern.matches("[a]*", "aaa"));

		System.out.println(Pattern.matches("[a]{2}", "aa"));
		System.out.println(Pattern.matches("[a]{2,}", "aaaa"));
		System.out.println(Pattern.matches("[a]{1,3}", "aaaa"));

		System.out.println(Pattern.matches("[a-z A-Z 0-9 @]{3,5}", "stjD8"));
	}
}





