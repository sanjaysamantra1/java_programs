public class OverflowUnderflowDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Maximum int: " + max);
        System.out.println("Overflow: " + (max + 1));

        byte value = 127;
        value++;
        System.out.println("value: " + value); // -128

        System.out.println("Minimum int: " + min);
        System.out.println("Underflow: " + (min - 1));
    }
}