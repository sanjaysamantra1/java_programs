import java.util.regex.*;

class Demo_5
{
	public static void main(String args[])
	{

		    String regex = "\\BJava\\B";
		    String replacementStr = "XML";
		    String inputStr = "Java and pJavaScript";
		    String newStr = inputStr.replaceAll(regex, replacementStr);

		    System.out.println("Regular  Expression: " + regex);
		    System.out.println("Input String: " + inputStr);
		    System.out.println("Replacement String:  " + replacementStr);
    		System.out.println("New String:  " + newStr);
	}
}
/*
\\b to get \b inside the string literal.
"\\bJava\\b"	"Java"
"\\bJava\\B"	"Java*"
"\\BJava\\b"	"*Java"
"\\BJava\\B"	"*Java*"

*/