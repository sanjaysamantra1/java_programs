public class ForLoopTest1 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };

        for (int number : numbers) {
            number = number * 2;
        }
        System.out.println(numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println(java.util.Arrays.toString(numbers));
    }
}

// For primitive array elements, number receives a copy of the current value.
// Changing that local variable does not change the original array element
// To modify the actual array, use a traditional for loop: