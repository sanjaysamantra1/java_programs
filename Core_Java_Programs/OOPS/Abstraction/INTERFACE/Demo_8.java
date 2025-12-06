class A
{
	int x=5;
	public void disp(){
		System.out.println("This is Disp");
	}
}
interface B{
	int y=6;
	void disp2();
}
	
class C extends A implements B
{	
	public void disp2(){
		System.out.println("This is Disp-2");
	}
	public static void main(String args[])
	{
		C ob = new C();
		System.out.println(ob.x);
		System.out.println(ob.y);
		ob.disp();
		ob.disp2();
	}
}