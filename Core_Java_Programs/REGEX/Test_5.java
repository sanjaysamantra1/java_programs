/*Create a regular expression to split the string by digit */

import java.util.regex.*;
import java.util.*;

class RegexTest5
{
	public static void main(String args[])
	{
		String test="sanjay kumar samantra";

		String words[]=test.split("\\s");

		System.out.println("No of Words: "+words.length);

		for(String x:words)
		System.out.println(x+"  ");
	}
}