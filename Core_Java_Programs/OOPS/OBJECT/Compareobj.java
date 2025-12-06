class A
{
  int i,j;

  void fun1()
  {
	i=i+1;
	j=j+1;
	System.out.println("fun1() of class A");
  }
}

class Compareobj
{
  public static void main(String args[])
  {
    A a1=new A();
    a1.i=6;

    A a2=new A();
    System.out.println(a2.i);

    A a3=a2;
    a3.i=8;
    System.out.println(a2.i);

    if(a2==a3)
      System.out.println("a2 & a3 are same");
    else
      System.out.println("a2 & a3 are not same");

      System.out.println(a2);
      System.out.println(a3);
   }
 }
