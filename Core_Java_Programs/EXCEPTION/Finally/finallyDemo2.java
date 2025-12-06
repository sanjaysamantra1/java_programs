class finallyDemo2{
  public static void main(String args[]){
	  try
	  {
	  System.out.println("Hello");
	  int x=5/0;
	  }
	  catch(ArithmeticException ob){
		  System.out.println("Arithmetic exception occured");
	  }
	  finally{
		  System.out.println("this is finally block");
	  }
	  System.out.println("Rest of the code");
  }
}