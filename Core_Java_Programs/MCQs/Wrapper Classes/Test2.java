// Integer objects are reused if value -128 t0 127
class Test2
{
	public final static void main(String args[])
	{
		Integer i1=128;
		Integer i2=128;
		System.out.println(i1==i2);
		Integer i3=127;
		Integer i4=127;
		System.out.println(i3==i4);
	}
}
