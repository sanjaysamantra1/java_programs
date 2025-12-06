import java.util.*;

class SortDemo_1
{
	public static void main(String[] args)
	{
		int arr[]={30,10,50,60,20,80,70,40};

		System.out.println("Before Sort");
		for(int a:arr)
		{
			System.out.print(a+"  ");
		}
		Arrays.sort(arr);

		System.out.println("\n After Sort");
		for(int a:arr)
		{
			System.out.print(a+"  ");
		}
	}
}
