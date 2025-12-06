class A
{
	 public static int x = 5;
	 public int y = 6;

	public static void f1()	{
		System.out.println("f1........");
	}
	public void f2(){
		System.out.println("F2........");
	}
}

class Static_Demo
{
	public static void main(String args[])
	{
		System.out.println(A.x);
		A.f1();

		//System.out.println(A.y);
		//A.f2();

		A ob = new A();
		System.out.println(ob.y);
		ob.f2();

	}
}









