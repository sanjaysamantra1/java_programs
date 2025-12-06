class StringBuffer2
{
  public static void main(String args[])
  {
    StringBuffer s1=new StringBuffer("abc");
    System.out.println(s1);

    StringBuffer s2=s1.append('d'); // same reference('new' is not used)
    System.out.println(s2);

    if(s1==s2)
     System.out.println("s1 & s2 reference are same");
    else
     System.out.println("s1 & s2 reference are not same");

    System.out.println("s1= "+s1);
    System.out.println("s2= "+s2);
    System.out.println();

    StringBuffer s3=new StringBuffer("ijk");
    if(s1==s3)
	     System.out.println("s1 & s3 reference are same");
	else
     System.out.println("s1 & s3 reference are not same");

  }
}