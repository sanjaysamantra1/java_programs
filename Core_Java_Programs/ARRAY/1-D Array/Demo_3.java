import java.util.*;

class  Demo_3
{
  public static void main(String s1[])
  {
	Scanner s = new Scanner(System.in);
	String cars[] = new String[5];

	for(String car:cars)
	{
		System.out.print(car+" ");
	}
	System.out.println();

	for(int i=0;i<5;i++)
	{
		System.out.println("enter a car name");
		cars[i] = s.nextLine();
	}
	System.out.println();

	for(String car:cars)
	{
		System.out.print(car+" ");
	}


  }
}
