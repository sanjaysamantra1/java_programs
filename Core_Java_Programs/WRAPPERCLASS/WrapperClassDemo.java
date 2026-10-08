public class WrapperClassDemo {
    public static void main(String[] args) {
        int number = 100;

        Integer numberObject = Integer.valueOf(number);

        System.out.println("Primitive value: " + number);
        System.out.println("Wrapper object: " + numberObject);

        System.out.println("Maximum int: " + Integer.MAX_VALUE);
        System.out.println("Minimum int: " + Integer.MIN_VALUE);
    }
}