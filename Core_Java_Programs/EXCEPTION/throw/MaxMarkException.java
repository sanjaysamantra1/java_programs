import java.util.*;

class MarkException extends Exception
{

  MarkException(String s)
  {
	  super(s);
   }
}

class MaxMarkException
{
	public static void main(String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in);
		int mark;
		System.out.println("enter your mark");
	    mark=s.nextInt();

		if(mark>100)
			throw new MarkException(" max mark should nt be morethan 100");

		else
		 System.out.println("your mark is"+ mark);

		System.out.println("THANK U");

	}
}
