import java.util.*;

public class ArraySortDesc {

   public static void main(String[] args)
   {

     Integer arr[] = new Integer[]{3, 13, 1, 9, 21};
   //int arr[]={20,10,30};

      System.out.println("Before sort:....");
      for (int i : arr) {
      	System.out.print(i+"  ");
      }

      Comparator comp = Collections.reverseOrder();
      Arrays.sort(arr, comp);

      System.out.println("\n\nAfetr sort:........");
      for (int i : arr) {
      System.out.print(i+"  ");
        }
   }
}