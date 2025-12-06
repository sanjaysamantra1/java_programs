class EqualsTest2
{
  public static void main(String args[])
  {
	String s1=new String("hello");
	String s2=new String("hello");

	StringBuffer sb1=new StringBuffer("hello");
	StringBuffer sb2=new StringBuffer("hello");

	System.out.println(s1==s2);   // false
	System.out.println(s1.equals(s2)); // true
	System.out.println();    
	System.out.println(sb1==sb2);  //false
	System.out.println(sb1.equals(sb2));  //false
	System.out.println();

	//System.out.println(s1==sb1);  //C.E
	System.out.println(s1.equals(sb1));  //false

  }
}

