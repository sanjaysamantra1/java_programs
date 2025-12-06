/*equals() compares content of 2 string objects.
  ==  compares address of 2 string object
*/

class Equals2
{
  public static void main(String args[])
  {
	String str1="hello";
	String str2=new String("hello");

	if(str1.equals(str2))
	  System.out.println("Both strings are Equal");
	else
	  System.out.println("Both strings are not Equal");

	 if(str1==str2)
	  System.out.println("Both strings are same");
	else
	  System.out.println("Both strings are not same");

  }
}