/*Create a regular expression to format phone number */

import java.util.regex.*;
import java.util.*;

class Test_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number: ");
		String input = sc.nextLine();
		System.out.println("Your Entered Number is: "+input);

		String output = input.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1)-$2-$3");
		System.out.println("Your Formatted Number is: "+output);
	}
}




