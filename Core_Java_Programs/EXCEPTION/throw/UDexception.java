import java.util.*;

class UDexception
{
	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		int age;
		System.out.println("enter your age for voting");
	    age = s.nextInt();

		if(age<0)
			throw new InvalidAgeException(age+" is not a valid age");
		else
		 System.out.println("You have enterded: "+age);

		System.out.println("THANK U");

	}
}
