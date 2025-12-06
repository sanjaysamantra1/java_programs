// in overloading more specific one gets the first chance

class NullTest
{
	public void disp(String s)
	{
		System.out.println("string");
	}

	public  void disp(Object o)
	{
		System.out.println("object");
	}
	public static void main(String[] args)
	{
		NullTest ob=new NullTest();

		ob.disp("sanjay");
		ob.disp(new Object());
		ob.disp(null);
	}
}
