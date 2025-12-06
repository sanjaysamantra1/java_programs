class A
{
}
class B extends A
{
}
class InstanceOfDemo2
{
 	public static void main(String args[])
 	{
		A a=new A();
		B b=new B();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);

		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
	}
}