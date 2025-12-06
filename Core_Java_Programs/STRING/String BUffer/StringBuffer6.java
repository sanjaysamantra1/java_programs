// + cannot be used with StringBuffer for conacating strings

class StringBuffer6
{
  public static void main(String args[])
  {
	String s1="Sachin";
	System.out.println(s1+" Tendulkar");

    StringBuffer sb1=new StringBuffer("Sachin");
    System.out.println(sb1+" tendulkar");

    StringBuffer sb2=new StringBuffer(" Tendulkar");
    System.out.println(sb1+sb2);

    System.out.println(""+sb1+sb2);
    System.out.println(sb1+sb2.toString());
  }
}
