class Devidebyzero
{
	  static int x=8;
	  static int y=0;
	   static int z;
	public static void main(String[] args)
	{

   try{
	   z=x/y;
     }
    catch(Exception ae)
    {
		System.out.println(ae);
		ae.printStackTrace();
	}

	  System.out.println(z);

  }
}