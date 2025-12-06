class M
{
  int i,j;
  void funM()
  {
    System.out.println("funM() of class M");
  }
  void funN()
  {
    System.out.println("funN() of class M");
  }
}
class N extends M
{
	int i,k;

  void funN()
  {
    System.out.println("funN() of class N");
  }
  void fun1()
  {
    System.out.println("fun1() of class N");
  }
}

class Test
{
   public static void main(String[] args)
	{
	  M m1=new N();
	  m1.funM();
   // m1.fun1();
	  m1.funN();

	}
}
