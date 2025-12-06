abstract class A
{
	public void disp1()
	{
		System.out.println("disp method");
	}
	public abstract void disp2();
	public abstract void disp3();
}
class B extends A
{
	public void disp2()
	{
		System.out.println("disp-2 method");
	}
	public void disp3()
	{
		System.out.println("disp-3 method");
	}
}

class Demo1_1
{
	public static void main(String args[])
	{
		//A ob = new A();
		B ob = new B();
		ob.disp1();
		ob.disp2();
		ob.disp3();
	}
}