class Test1
{
	public final static void main(String args[])
	{
		Integer i1=new Integer(10);
		Integer i2=new Integer(20);
		swap(i1,i2);
		System.out.println(i1);
		System.out.println(i2);
		i1=interchange(i1,i2);
		System.out.println(i1);
		System.out.println(i2);
	}
	public static void swap(int i1,int i2)
	{
		int temp=i1;
		i1=i2;
		i2=temp;
	}
	public static int interchange(int i1,int i2)
	{
		int temp=i1;
		i1=i2;
		i2=temp;
		return i1;
	}
}