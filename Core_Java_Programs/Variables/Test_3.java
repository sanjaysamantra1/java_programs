class Test_3
{
	int a=5;
	static int b=7;

	public static void m1(){
		int c=10;
		System.out.println(c);

		Test_3 ob=new Test_3();
		System.out.println(ob.a);
		System.out.println(Test_3.b);

	}
    public static void main(String args[])
	{
		Test_3.m1();
	}

}



