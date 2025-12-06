

class ReturnTest 
{
	static void m1()
	{
		System.out.println("m1 start");
		return;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main started");
		m1();
		System.out.println("main end");
	}
}
