class MutableDemo2{
  public static void main(String args[])  {
   String s1=new String("Sachin");
   String s2=new String(" Tendulkar");
   System.out.println(s1.hashCode());
   s1 = s1.concat(s2);
   System.out.println(s1.hashCode());
   System.out.println(s1);

   StringBuffer sb1=new StringBuffer("Sachin");
   StringBuffer sb2=new StringBuffer(" Tendulkar");
   System.out.println(sb1.hashCode());
   sb1.append(sb2);
   System.out.println(sb1.hashCode());
   System.out.println(sb1);
  }
}
