public class GenericMethodTest {

   public static void printArray( Integer[] inputArray ) {
      for(Integer element : inputArray) {
          System.out.print(element+"  ");
      }
      System.out.println();
   }

   public static void main(String args[]) {
		Integer[] arr1 = {1,2,3,4,5};
		printArray(arr1);

		Character[] arr2 = {'a','b','c','d'};
		printArray(arr2);
	}
}








