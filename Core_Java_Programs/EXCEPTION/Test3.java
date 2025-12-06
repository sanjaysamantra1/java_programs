class A
{
	void funA()
	{
		System.out.println("i am funA");
	}
}
class Test3
{
	public static void main(String[] args)
	{
		A a1=null;

	  try
	  {
		  a1.funA();
	}
	catch(NullPointerException ne)
	{
		System.out.println(ne);
		ne.printStackTrace();
	        }
	    try
	    {
	    System.out.println("NPE handeled");
		int arr[]=new int[5];
		arr[5]=50;
		System.out.println("End of try");
	    }

	  catch(ArrayIndexOutOfBoundsException e)
	  	  {
	  		 System.out.println(e);
	  		 e.printStackTrace();
	  }
	   System.out.println("hello");
	   System.out.println("welcome");

	   System.out.println("End of main");
	}
}