class Test1
{

	static void m1(String ob)
	{
		System.out.println("Object: "+ob);
	}
	static void m1(Object ob)
	{
		System.out.println("Object: "+ob);
	}
	public static void main(String args[])
	{
			m1(null);
			m1("null");
	}


}