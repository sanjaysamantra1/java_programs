class MultipleCatch_1
{
  public static void main(String args[])
  {
	  int a[]={10,20,30,40};
	  try
	  {
	   //int x = Integer.parseInt("5 ");
	   //System.out.println(8/0);
	   System.out.println(a[7]);
	  }
	  catch(Exception e)
	  	 {
	  	 	  System.out.println(e);
	  	 	  System.out.println("this is Exception");
	  }

	  catch(ArrayIndexOutOfBoundsException ob)
	  {
		  System.out.println(ob);
		  System.out.println("this is ArrayIndexOutOfBoundsException");
	  }
	  catch(ArithmeticException ae)
	  {
	  	System.out.println(ae);
	  	System.out.println("this is ArithmeticException");
	  }


	  System.out.println("rest of the code");
  }
}