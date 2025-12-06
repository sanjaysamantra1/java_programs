class Sdemo8{

	static void disp(String str)
	{
		System.out.println("string");
	}
	static void disp(Object obj)
	{
		System.out.println("object");
	}

 	public static void main(String args[])
 	{
   		disp(null);
   		disp("null");
 	}
}
