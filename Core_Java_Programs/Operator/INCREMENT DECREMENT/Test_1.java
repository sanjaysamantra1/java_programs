class Test_1
{
  public static void main(String args[])
  {
	int a = 3,b;
    b = a++ + a++ + ++a;
    System.out.println("a: "+a);
    System.out.println("b: "+b);
  }
}