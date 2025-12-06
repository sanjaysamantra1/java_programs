import java.util.*;

class  Array_Sort_1
{
  public static void main(String s1[])
  {
	int arr[]={10,18,12,13,14,15,16};

	System.out.println("Before sort: ");
	for(int i:arr)
	 System.out.print(i+"  ");

	Arrays.sort(arr);

	System.out.println("\n\nAfter sort: ");
	for(int i:arr)
	 System.out.print(i+"  ");

  }
}
