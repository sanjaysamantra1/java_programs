class Access1
{
	public int x;
	private int y;

	public void fun1()
	{
	  System.out.println("x="+x);
	  System.out.println("y="+y);
	}
	private void fun2()
	{
      x = x+1;
	  y = y+1;
	}

}
class Test1
{
	public static void main(String[] args)
		{
			Access1 a1 = new Access1();
			a1.x = 2;
			//a1.y=3;
			//a1.fun2();
			a1.fun1(); // x=3  y=4
	}
}
