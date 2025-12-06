
class Pattern5
{
   public static void main(String args[])
   {int k=1;
      for(int row=1;row<=5;row++)
      {
		  for(int col=1;col<=row;col++)
		  {
			  System.out.print(" "+k);k=k+2;
		  }
		 System.out.println();
	   }
   }
}