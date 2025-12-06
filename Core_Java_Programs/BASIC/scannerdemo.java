import java.util.*;

class scannerdemo
{

	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);

		System.out.println("enter an integer");
		int x=ob.nextInt();
		System.out.println("ur no is "+x);

		System.out.println("enter a string");
		String s=ob.next();
		System.out.println("ur name is "+s);

		System.out.println("enter a float");
		float f=ob.nextFloat();
		System.out.println("ur no is= "+f);

	}
}
