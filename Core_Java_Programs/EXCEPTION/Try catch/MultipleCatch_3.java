class MultipleCatch_3
{
  public static void main(String args[])
  {
	  int a[]={10,20,30,40};
	  try
	  {
	   System.out.println(a[0]);
	   //System.out.println(8/0);
	   System.out.println(a[7]);
	  }

	  catch(Exception ae)
	  {
	  	  	System.out.println(ae);
	  	  	System.out.println("this is Exception");
	  }
	  catch(ArrayIndexOutOfBoundsException ob)
	  {
		  System.out.println(ob);
		  System.out.println("this is ArrayIndexOutOfBoundsException");
	  }
	  catch(NullPointerException ob)
	  {
			System.out.println(ob);
    		System.out.println("this is NullPointerException");
	  }


  }
}