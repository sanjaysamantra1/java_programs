/*use of string methods*/

class Sdemo5
{
  public static void main(String args[])
  {
	String s1="abc";
	String s2=new String("abc");
	boolean flag=s1.contentEquals(s2);
    System.out.println("flag= "+flag);

    String s3="ijk";
    boolean flag2=s3.equals("ijk");
    System.out.println("flag2= "+flag2);
   	System.out.println();

   	String s4=new String("AbC");
   	boolean flag3=s4.equalsIgnoreCase("aBC");
   	System.out.println("flag3= "+flag3);
  }
}


