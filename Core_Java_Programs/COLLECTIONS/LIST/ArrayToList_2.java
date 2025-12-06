import java.util.*;
public class ArrayToList_2
{
  public static void main(String[] args)
  {
    int[] arr =new int[]{ 1, 3, 7 };

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);

	List<Integer> list = new ArrayList(Arrays.asList(arr));
    System.out.println(list);

  }
}