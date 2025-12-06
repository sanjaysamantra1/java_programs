import java.util.*;

class ExInfoDemo1
{
	public static void main(String[] args)
	{
		try{
			System.out.println(8/0);
		}
		catch(Exception ob)
		{
			System.out.println(ob.getMessage());
			System.out.println("---------------------");
			System.out.println(ob.toString());
			System.out.println("---------------------");
			ob.printStackTrace();
		}

	}
}
