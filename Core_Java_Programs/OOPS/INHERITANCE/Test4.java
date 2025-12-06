// we can increse the access privilage in subclasses but cann't decrease

class A
{
	public void m1()
	{
		System.out.println("m1() of class A");
	}
}
class B extends A
{
	protected void m1()
	{
		System.out.println("m1() of class B");
	}
}

class Test4
{
	public static void main(String[] args)
	{
		B b1=new B();
		b1.m1();
	}
}
