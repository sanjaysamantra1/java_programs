class X
{
	public void disp()
	{
		System.out.println("disp() of X class");
	}
}
class Y extends X
{
	public void disp()
	{
			System.out.println("disp() of Y class");
	}
}

class Test5
{
	public static void main(String[] args)
	{
		X ob=new X();
		ob.disp();

		Y ob2=new Y();
		ob2.disp();

		X ob3=new Y();
		ob3.disp();
	}
}
