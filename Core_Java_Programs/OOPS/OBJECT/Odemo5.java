// object of a class defined as instance variable

class Odemo5
{
  int x=5;
  A a1=new A();  // object of a class defined as instance variable

  public static void main(String args[])
  {
    Odemo5 d1=new Odemo5();
    System.out.println("d1.a1= "+d1.a1);
    System.out.println("d1.a1.i= "+d1.a1.i);
    System.out.println(d1.x+1);
    d1.a1.funA(); // calling funA() of class A
  }
}

