class Test2
{
	static int x=5;

	public final static void main(String args[])
	{
		System.out.println(x);
		System.out.println(Test2.x);

		Test2 ob1=new Test2();
		Test2 ob2=null;
		//Test2 ob3;
		System.out.println(ob1.x);
		System.out.println(ob2.x);
		//
		System.out.println(ob3.x);
	}
}