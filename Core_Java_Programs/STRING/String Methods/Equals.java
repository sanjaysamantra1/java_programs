/*This prog compares two strings*/

class Equals
{
  public static void main(String args[])
  {
	String str1 = "Sachin";
	String str2 = "sachin";
	System.out.println(str1.equals(str2));
	System.out.println(str1.equalsIgnoreCase(str2));
  }
}