interface A
{
	int x=5;
	void disp();
	void disp2();
}
class B implements A
{
	public void disp(){
		System.out.println("This is Disp");
	}
	public void disp2(){
		System.out.println("This is Disp-2");
	}
	public static void main(String args[])
	{
		//A ob = new A();
		A ob = new B();
		System.out.println(ob.x);
		ob.disp();
		ob.disp2();
	}
}