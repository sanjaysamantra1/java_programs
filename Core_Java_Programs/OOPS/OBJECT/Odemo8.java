class A
{
	int i=0,j=0;
}
class Odemo8
{
  int x=1;
  A a1=new A();

  Odemo8 d8=new Odemo8();

  public static void main(String args[])
  {
    Odemo8 d8=new Odemo8();
    System.out.println("d8.x= "+d8.x);
    d8.d8=new Odemo8();
    d8.d8.d8=new Odemo8();
    int x=13;

    d8.d8.d8.x=x;
    d8.d8.d8.d8=d8;
    d8.x=9;

    System.out.println("d8.d8.d8.d8.x= "+d8.d8.d8.d8.x);
    System.out.println("d8= "+d8);
    System.out.println("d8.d8.d8= "+d8.d8.d8);
    System.out.println("d8.d8.d8.d8= "+d8.d8.d8.d8);
  }
}
