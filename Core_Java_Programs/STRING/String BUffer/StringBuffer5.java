// + cannot be used with StringBuffer for conacating strings

class StringBuffer5{
  public static void main(String args[])  {
   String s1 = new String("Sachin");
   //s1=s1.concat(" Tendulkar");
   s1 = s1+" Tendulkar";
   System.out.println(s1);

   StringBuffer sb1 = new StringBuffer("Sachin");
   sb1 = sb1+" Tendulkar"; //error
   System.out.println(sb1);
  }
}
