class Demo2
{
	int x=5;
	static int y=7;

    public static void main(String args[])
	{
		Demo2 ob1=new Demo2();
		Demo2 ob2=new Demo2();
		System.out.println(Demo2.y);
		System.out.println(ob1.y);
		System.out.println(ob2.y);
		ob1.y=45;
		System.out.println(Demo2.y);
		System.out.println(ob1.y);
		System.out.println(ob2.y);

	}

}