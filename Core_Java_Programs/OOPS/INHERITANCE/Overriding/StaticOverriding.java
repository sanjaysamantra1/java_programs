class A
{
	static void m1()
	{
		System.out.println("m1 of class A");
	}
}

class B extends A
{
	static void m1()
	{
		System.out.println("m1 of class B");
	}

}
class StaticOverriding
{
public static void main(String args[])
	{
		A ob=new B();
		ob.m1();
	}
}