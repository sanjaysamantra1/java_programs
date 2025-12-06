class A
{
}
class B extends A
{
}
class InstanceOfDemo3
{
 	public static void main(String args[])
 	{
		A a=new B();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
	}
}