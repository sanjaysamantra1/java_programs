public class ArrayPassingDemo {
        static void changeArray(int[] numbers) {

                numbers[0] = 999;
        }
        public static void main(String[] args) {
                int[] numbers = { 10, 20, 30 };

                System.out.println("Before:");
                System.out.println(numbers[0]);

                changeArray(numbers);

                System.out.println("After:");
                System.out.println(numbers[0]);
        }
}

// method receives a copy of the array reference, which refers to the same array object.