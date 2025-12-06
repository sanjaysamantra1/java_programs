// Default Exception handler always uses printStackTrace method

class ExceptionInformation
{
	public static void main(String[] args)
	{
       	try{
			//String s="abc";
			//int i=Integer.parseInt(s);
			System.out.println(5/0);
		  }
		  catch(Exception e){
			  System.out.println("getMessage().....");
			  System.out.println(e.getMessage()); //only exception description
			  System.out.println();


			  System.out.println("toString().....");
			  System.out.println(e.toString()); //name of exception:description
			  System.out.println();

			  System.out.println("printstacktrace().....");
			  e.printStackTrace(); //name of exception:description + stacktrace
		  }
    }
}