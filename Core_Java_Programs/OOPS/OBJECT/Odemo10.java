class Odemo10
{
  void fun1(int x)
  {
    int sq=x*x;
    System.out.println("square of "+x+" is= "+sq);
  }
 public static void main(String args[])
 {
   Odemo10 d=new Odemo10();
   d.fun1(4);
   int i=5;
   d.fun1(i);
 }
}
