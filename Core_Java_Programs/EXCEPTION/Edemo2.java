class A
{
	void funA()
	{
		System.out.println("i am funA");
		}
}
class Edemo2
{
	public static void main(String[] args)
	{
	  int i=Integer.parseInt(args[0].trim());
	  int j=Integer.parseInt(args[1].trim());
	  int k=Integer.parseInt(args[2].trim());
	  int l=Integer.parseInt(args[3].trim());

      A a1=null;

	  try
	  {
		int x=i/j;
	    x=x+1;
	    System.out.println("X= "+x);
		if(x>5)
		  a1=new A();
	    a1.funA();
		int arr[]=new int[k];
		arr[l]=x;
		System.out.println("End of try");
	  }
 	  catch(ArithmeticException e1)
	  {
		 System.out.println(e1);
		 System.out.println("logical errors in main ");
	  }
	  catch(NullPointerException e2)
	  {
		 System.out.println(e2);
		 System.out.println("logical errors in main ");
	  }
	  catch(ArrayIndexOutOfBoundsException e3)
	  {
		 System.out.println(e3);
		 System.out.println("logical errors in main ");
	  }
  
      catch(Exception e)     // Throwable e
	  {
		 System.out.println(e);
	  }
	   System.out.println("i= "+i);
	   System.out.println("j= "+j);
	   System.out.println("k= "+k);
	   System.out.println("l= "+l);
	   System.out.println("End of main");
	}
}


/* javac Edemo1.java
   java Edemo1 5 7
*/