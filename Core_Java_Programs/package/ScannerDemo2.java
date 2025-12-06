import java.util.*;

class ScannerDemo2
{
 	public static void main(String a[])
 	{
		Scanner ob=new Scanner(System.in);

  		System.out.println("Enter your firstname");
  		String fname = ob.nextLine();

  		System.out.println("Enter your lastname");
  		String lname = ob.next();

  		System.out.println("first name: "+fname);
  		System.out.println("Last name: "+lname);
  	}
}

