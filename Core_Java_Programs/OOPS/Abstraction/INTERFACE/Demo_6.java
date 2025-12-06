interface A
{
	int x=5;
	void disp();
}
interface B extends A{
	int y=6;
	void disp2();
}

class C implements B
{
	public void disp(){
		System.out.println("This is Disp");
	}
	public void disp2(){
		System.out.println("This is Disp-2");
	}
}

class Demo_6{
	public static void main(String args[])
		{
			C ob = new C();
			System.out.println(ob.x);
			System.out.println(ob.y);
			ob.disp();
			ob.disp2();
	}
}