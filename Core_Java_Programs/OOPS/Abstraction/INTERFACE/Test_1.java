interface A{
	int x=5;
}
interface B{
	int x=6;
}

class Test_1 implements A,B
{
	public static void main(String args[])
	{
		//Test_1 ob = new Test_1();
		//System.out.println(ob.x);

		A ob1 = new Test_1();
		System.out.println(ob1.x);

		B ob2 = new Test_1();
		System.out.println(ob2.x);
	}
}