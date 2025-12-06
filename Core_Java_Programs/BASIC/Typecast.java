class Typecast
{
  void fun1(byte b)
  {
   System.out.println("fun1(byte b)");
  }

 public static void main(String args[])
  {
    Typecast t=new Typecast();
    t.fun1((byte)3);

    byte b=4;     //exception case
    System.out.println(b);

    short s=5;    //exception case
    System.out.println(s);

    int x=6;
    byte c=(byte)x;
    System.out.println(c);

    char ch=89;    //exception case
    System.out.println(ch);
   }
}