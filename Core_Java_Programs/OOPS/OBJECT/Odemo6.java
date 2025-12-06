class A
{
	int i,j;
}
class Odemo6
{
  int x;
  A a1;

  public static void main(String args[])
  {
    Odemo6 d1=new Odemo6();
    System.out.println("d1.x= "+d1.x);
    System.out.println("d1.a1= "+d1.a1);
 // System.out.println(d1.a1.i);  //runtime error
    d1.a1=new A();
    d1.x=3;
    System.out.println("d1.a1= "+d1.a1);
    System.out.println("d1.a1= "+d1.a1);
  }
}

