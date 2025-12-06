import java.util.*;

public class ArraySortDesc2 {

   public static void main(String[] args)
   {

   String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"};

   Arrays.sort(fruits);
   System.out.println("Alphabetical order: " + Arrays.toString(fruits));

   Arrays.sort(fruits, Collections.reverseOrder());
   System.out.println("Reverse-alphabetical order: " + Arrays.toString(fruits));



   }
}