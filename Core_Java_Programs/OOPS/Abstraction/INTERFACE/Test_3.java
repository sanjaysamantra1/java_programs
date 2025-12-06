interface A{
	public void disp();
}
interface B{
	public void disp();
}
class Test_3 implements A,B
{
	public void disp()
	{
		System.out.println("This is disp");
	}
	public static void main(String args[])
	{		
		Test_3 ob = new Test_3();
		ob.disp();
	}
}