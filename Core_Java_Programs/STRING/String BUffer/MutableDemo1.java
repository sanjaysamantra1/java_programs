class MutableDemo1{
  public static void main(String args[])  {

   String s1 = new String("Sachin");
   String s2 = new String(" Tendulkar");
   s1.concat(s2);
   System.out.println(s1);
   //System.out.println(s1.concat(s2));
   //System.out.println(s3);

   StringBuffer sb1 = new StringBuffer("Sachin");
   StringBuffer sb2 = new StringBuffer(" Tendulkar");
   sb1.append(sb2);
   System.out.println(sb1);
  }
}
