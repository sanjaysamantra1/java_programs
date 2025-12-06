class A
{
	protected int i;

	A(int i)
	{
	  this.i=i;
	}
	A()
	{
	  this.i=11;
	}
}
class B extends A
{
	int i=2;

	B(int i)
	{
		super(i);
	}
}
class Test1
{
	public final static void main(String args[])
	{
		B ob=new B(8);
		System.out.println(ob.i);
	}
}