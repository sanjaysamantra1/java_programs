class Edemo1
{
	public static void main(String[] args)
	{
	  int i=Integer.parseInt(args[0].trim());
	  int j=Integer.parseInt(args[1].trim());

   /* int x=i/j;
	  x=x+1;
	  System.out.println("X= "+x);  */

	  try
	  {
		int x=i/j;
	    x=x+1;
	    System.out.println("X= "+x);
	  }
	  catch(ArithmeticException e1)
	  {
		 System.out.println(e1);
		 System.out.println("logical errors in main ");
	  }
	   System.out.println("i= "+i);
	   System.out.println("j= "+j);
	   System.out.println("End of main");
	}
}


/* javac Edemo1.java
   java Edemo1 5 7
*/