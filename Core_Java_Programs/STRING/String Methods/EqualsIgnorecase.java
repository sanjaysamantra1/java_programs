/*This prog compares two strings*/

class EqualsIgnorecase
{
  public static void main(String args[])
  {
	String str1 = "SaCHIN";
	String str2 = "sachin";

	System.out.println(str1.equals(str2));
	System.out.println(str1.equalsIgnoreCase(str2));
  }
}