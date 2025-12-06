class Demo1
{
	int a = 5;
	static int b = 7;

	public void m1(){
		int c = 10;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		//System.out.println(d);
	}
    public static void main(String args[])
	{
		int d = 15;
		Demo1 ob=new Demo1();
		System.out.println(Demo1.b);
		//System.out.println(Demo1.c);
		System.out.println(ob.a);
		ob.m1();
		System.out.println(d);
	}

}



