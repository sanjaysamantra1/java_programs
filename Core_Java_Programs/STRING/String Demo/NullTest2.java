

class NullTest2
{
	public void disp(String s)
	{
		System.out.println("string");
	}

	public  void disp(StringBuffer sb)
	{
		System.out.println("StringBuff");
	}
	public static void main(String[] args)
	{
		NullTest2 ob=new NullTest2();

		ob.disp("sanjay");
		ob.disp(null);
	}
}

// C.E: reference to disp is ambiguous
