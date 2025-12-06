import java.util.*;
class UDexception_1
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int age;
		System.out.println("enter your age");
	    age=s.nextInt();
		try
		{
		if(age<0)
			throw new InvalidAgeException(age+" is not a valid number");
		else
		 System.out.println("your age is "+age);
		}
		catch(InvalidAgeException ob)
		{
		  System.out.println(ob);
		  System.out.println("enter your age");
	      age=s.nextInt();
	      System.out.println("your age is "+age);
		}
		System.out.println("THANK U");

	}
}
