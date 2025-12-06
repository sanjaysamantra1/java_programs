/*This prog removes all the leading and trailing whitespaces*/

class Trim
{
  public static void main(String args[])
  {
	String str = "       this    is java class        ";
	str = str.trim();
    System.out.println("The string is: "+str);
  }
}