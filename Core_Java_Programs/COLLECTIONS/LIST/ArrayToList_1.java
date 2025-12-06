import java.util.*;
public class ArrayToList_1
{
  public static void main(String[] args)
  {
    Integer[] arr = { 1, 3, 7 };

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);

	ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
    System.out.println(list);
    System.out.println("size: "+list.size());

  }
}