class Test_2
{
	int a=5;
	static int b=7;

	public static void m1(){
		int c=10;
		System.out.println(c);
		//System.out.println(a);
		System.out.println(b);

	}
    public static void main(String args[])
	{
		Test_2 ob=new Test_2();
		System.out.println(Test_2.b);
		System.out.println(ob.a);
		System.out.println();
		Test_2.m1();
	}

}



