import java.util.Arrays;
import java.util.List;

public class ArraysMethodsDemo {

        public static void main(String[] args) {
                int[] numbers = { 50, 20, 40, 10, 30 };
                System.out.println("1. toString():");
                System.out.println(Arrays.toString(numbers));

                int[][] matrix = {
                                { 10, 20 },
                                { 30, 40 }
                };
                System.out.println("\n2. deepToString():");
                System.out.println(Arrays.deepToString(matrix));

                int[] sortArray = { 50, 20, 40, 10, 30 };
                Arrays.sort(sortArray);
                System.out.println("\n3. sort():");
                System.out.println(Arrays.toString(sortArray));

                int[] rangeArray = { 50, 40, 30, 20, 10 };
                Arrays.sort(rangeArray, 1, 4);
                System.out.println("\n4. sort() with range:");
                System.out.println(Arrays.toString(rangeArray));

                int[] searchArray = { 10, 20, 30, 40, 50 };
                int index = Arrays.binarySearch(searchArray, 30);
                System.out.println("\n5. binarySearch():");
                System.out.println("Index of 30: " + index);

                int[] array1 = { 10, 20, 30 };
                int[] array2 = { 10, 20, 30 };
                System.out.println("\n6. equals():");
                System.out.println(Arrays.equals(array1, array2));

                int[][] matrix1 = {
                                { 10, 20 },
                                { 30, 40 }
                };
                int[][] matrix2 = {
                                { 10, 20 },
                                { 30, 40 }
                };
                System.out.println("\n7. deepEquals():");
                System.out.println(Arrays.deepEquals(matrix1, matrix2));

                int[] original = { 10, 20, 30 };
                int[] copiedArray = Arrays.copyOf(original, 5);
                System.out.println("\n8. copyOf():");
                System.out.println(Arrays.toString(copiedArray));

                int[] rangeOriginal = { 10, 20, 30, 40, 50 };
                int[] rangeCopy = Arrays.copyOfRange(rangeOriginal, 1, 4);
                System.out.println("\n9. copyOfRange():");
                System.out.println(Arrays.toString(rangeCopy));

                int[] fillArray = new int[5];
                Arrays.fill(fillArray, 100);
                System.out.println("\n10. fill():");
                System.out.println(Arrays.toString(fillArray));

                int[] fillRangeArray = { 10, 20, 30, 40, 50 };
                Arrays.fill(fillRangeArray, 1, 4, 99);
                System.out.println("\n11. fill() with range:");
                System.out.println(Arrays.toString(fillRangeArray));

                String[] names = {
                                "John",
                                "Alice",
                                "Bob"
                };
                List<String> nameList = Arrays.asList(names);
                System.out.println("\n12. asList():");
                System.out.println(nameList);

                int[] mismatchArray1 = { 10, 20, 30, 40 };
                int[] mismatchArray2 = { 10, 20, 99, 40 };
                int mismatchIndex = Arrays.mismatch(mismatchArray1, mismatchArray2);
                System.out.println("\n13. mismatch():");
                System.out.println("First mismatch index: " + mismatchIndex);

                // ==========================================
                // 14. Arrays.compare()
                // ==========================================

                int[] compareArray1 = { 10, 20, 30 };
                int[] compareArray2 = { 10, 20, 40 };

                int compareResult = Arrays.compare(compareArray1, compareArray2);

                System.out.println("\n14. compare():");
                System.out.println("Compare result: " + compareResult);

                int[] setAllArray = new int[5];
                Arrays.setAll(setAllArray, i -> i * 10);
                System.out.println("\n15. setAll():");
                System.out.println(Arrays.toString(setAllArray));

                int[] parallelArray = {
                                50, 20, 40, 10, 30
                };
                Arrays.parallelSort(parallelArray);
                System.out.println("\n16. parallelSort():");
                System.out.println(Arrays.toString(parallelArray));

                int[] reverseArray = {
                                10, 20, 30, 40, 50
                };

                // Java does NOT have: Arrays.reverse(reverseArray);
                // We need to reverse manually.
                int left = 0;
                int right = reverseArray.length - 1;

                while (left < right) {
                        int temp = reverseArray[left];
                        reverseArray[left] = reverseArray[right];
                        reverseArray[right] = temp;
                        left++;
                        right--;
                }
                System.out.println("\n17. Reverse manually:");
                System.out.println(Arrays.toString(reverseArray));
        }
}