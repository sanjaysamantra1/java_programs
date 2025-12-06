class Demo_1
{
	public static void main(String[] args)
	{
	   System.out.println("Main started");
	   System.out.println("hello java");
	   try
	   {
		   System.out.println(5/0);
	   }
	   catch(Exception ob)
	   {
		   System.out.println(ob);
	   }
	   System.out.println("Good morning");
	   System.out.println("End of main");

	}
}

//1. exception object will be created
	//ArithmeticException ob = new ArithmeticException();
//2. exception object will be thrown
	 //throw ob;
//3. will check developer has written exception handling code?
//4. yes-exception object will go to developer written catch()
//5. no-exception object goes to default exception handler
//6. default exception handler prints exception information
// halts prog execution
