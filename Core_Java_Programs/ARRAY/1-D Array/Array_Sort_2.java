import java.util.*;

class  Array_Sort_2
{
  public static void main(String s1[])
  {
	String arr[]={"deepak","ajay","ramesh","gopal"};

	System.out.println("Before sort: ");
	for(String i:arr)
	 System.out.print(i+"  ");

	Arrays.sort(arr);

	System.out.println("\nAfter sort: ");
	for(String i:arr)
	 System.out.print(i+"  ");

  }
}
