abstract class A
{
	public void disp()
	{
		System.out.println("disp method");
	}
	public abstract void disp2();
}
class B extends A
{
	public void disp2()
	{
	   System.out.println("disp2 method");
	}
}
class Demo1_2
{
	public static void main(String[] args)
	{
		B ob=new B();
		ob.disp();
		ob.disp2();
	}
}


