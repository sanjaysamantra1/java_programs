class finallyDemo3{
  public static void main(String args[]){
	  try
	  {
	  System.out.println("Hello");
	  int x=5/0;
	  }
	  catch(ArithmeticException ob)
	  {
		  System.out.println("Arithmetic exception occured");
		  System.exit(0);
	  }
	  finally
	  {
		  System.out.println("this is finally block");
	  }
	  System.out.println("Rest of the code");
  }
}