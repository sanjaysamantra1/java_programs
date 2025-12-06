class tryCatchDemo1{
  public static void main(String args[]){
	  try
	  {
	  System.out.println("Hello-1");
	  System.out.println(5/0);
	  System.out.println("Hello-2");
	  }
	  catch(Exception ob)
	  {
		  System.out.println(ob);
	  }
	  System.out.println("Hi");
  }
}