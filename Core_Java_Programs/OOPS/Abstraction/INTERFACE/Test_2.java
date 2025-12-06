interface A{
	int x=5;
}
class Test_2 implements A
	int x=6;
	
	public static void main(String args[])
	{
		Test_1 ob = new Test_1();
		System.out.println(ob.x);
		
		A ob1 = new Test_2();
		System.out.println(ob1.x);
	}
}