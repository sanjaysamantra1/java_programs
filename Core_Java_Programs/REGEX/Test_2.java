/*Create a regular expression to remove white spaces from a string */

import java.util.regex.*;

class Test_2
{
	public static void main(String args[])
	{
		String pattern="[\\s]";
		String replace="";

		String str="name=john age=13 year=2001";

		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(str);

		str=m.replaceAll(replace);
		System.out.println(str);

		String s2=" 098 6121 6682 ";
		s2 = s2.replaceAll("\\s","");
		System.out.println(s2);
	}
}