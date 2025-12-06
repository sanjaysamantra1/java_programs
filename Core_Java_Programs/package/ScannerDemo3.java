import java.util.*;

class ScannerDemo3
{
 	public static void main(String a[])
 	{
		Scanner ob = new Scanner(System.in);

  		System.out.println("Enter a sentence");
  		String s1 = ob.nextLine();
  		System.out.println(s1);

  		System.out.println("Enter another sentence");
		String s2 = ob.next();
  		System.out.println(s2);
  	}
}

