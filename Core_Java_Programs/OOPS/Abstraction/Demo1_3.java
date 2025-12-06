abstract class A
{
	public void disp1()
	{
		System.out.println("disp method");
	}
	public abstract void disp2();
	public abstract void disp3();
}
abstract class B extends A
{
   public void disp2()
   {
	   System.out.println("disp2 method");
   }
}
class C extends B
{
	public void disp3()
	{
		System.out.println("disp3 method");
	}
}
class Demo1_3
{
	public static void main(String args[])
	{
		C ob = new C();
		ob.disp1();
		ob.disp2();
		ob.disp3();
	}
}