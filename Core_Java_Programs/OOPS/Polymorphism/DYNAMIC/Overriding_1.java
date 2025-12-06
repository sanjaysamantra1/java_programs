class A
{
}

class Overriding_1
{
	public static void main(String args[])
	{
		A ob = new A();

		System.out.println(ob.toString());
		System.out.println(ob.hashCode());
	}
}