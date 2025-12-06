class StringBuffer1
{
  public static void main(String args[])
  {
    StringBuffer s1 = new StringBuffer("hello");
    StringBuffer s2 = new StringBuffer("hello");

   System.out.println(s1==s2); //false
   System.out.println(s1.equals(s2)); //false

   String s3 = new String("hello");
   String s4 = new String("hello");

   System.out.println(s3==s4); // reference compare
   System.out.println(s3.equals(s4));//contenet compare
  }
}
//equals method is not overriden in StringBuffer class
// Object class equals method gets called
//public boolean equals(Object obj){
//	return (this==obj);
//	}