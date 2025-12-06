import java.util.*;

class  Array_Reverse_1
{
  public static void main(String s1[])
  {
	int arr[]={10,18,12,13,14,15,16};

	System.out.println("Before reverse: ");
	for(int i:arr)
	 System.out.print(i+"  ");

	Arrays.reverse(arr);

	System.out.println("\n After reverse: ");
	for(int i:arr)
	 System.out.print(i+"  ");

  }
}
