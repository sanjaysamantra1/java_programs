class StringBuffer3
{
  public static void main(String args[])
  {
   StringBuffer s1=new StringBuffer("hello");//value in constructor
   System.out.println(s1.length());
   System.out.println(s1.capacity());

   StringBuffer s2=new StringBuffer();
   s2.append("hello");
   System.out.println(s2.length());
   System.out.println(s2.capacity());

   s2.append("hi good morning");
   System.out.println(s2.length());
   System.out.println(s2.capacity());
  }
}
/*initial capacity=16
hello=5, capacity=16+5=21
good morning=12, capacity=16+12=28 (value in constructor)  */

// (oldcapacity*2)+2   (no value in constructor)