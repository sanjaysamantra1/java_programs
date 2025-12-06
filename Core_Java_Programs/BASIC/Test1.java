class Test1
{
	int x=2;
	//x=7;
	public void fun1()
	{
      x=5;
      System.out.println(x);
	}
	public static void main(String[] args)
	{
		Test1 t1=new Test1();

		System.out.println(t1.x);
		t1.fun1();
	}
}
