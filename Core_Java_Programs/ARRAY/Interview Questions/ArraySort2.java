import java.util.*;

public class ArraySort2 {

   public static void main(String[] args) {

   // initializing unsorted int array
   int iArr[] = {2, 1, 9, 6, 4};

   // let us print all the elements available in list
   System.out.println("The Unsorted int array is: \n");
   for (int number : iArr) {
   		System.out.print(number+"  ");
   }

   // sorting array
   Arrays.sort(iArr);

   // let us print all the elements available in list
   System.out.println("\n\nThe sorted int array is: \n");
   for (int number : iArr) {
   		System.out.print(number+"  ");
   }

   }
}