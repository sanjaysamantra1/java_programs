/*This prog compares two strings*/

class EqualsTest
{
  public static void main(String args[])
  {
	String s1=new String("hello");
	String s2=new String("hello");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));

	System.out.println();


    StringBuffer sb1=new StringBuffer("hello");
	StringBuffer sb2=new StringBuffer("hello");
	System.out.println(sb1==sb2);  //false
	System.out.println(sb1.equals(sb2));  //false
  }
}

//in string class .equals is overridden for content comparision
// in StringBuffer .equals in not overridden so .equals method from object class is called
// default behaviour of .equals is for reference comparision

