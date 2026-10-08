public class BoxingDemo {
    public static void main(String[] args) {
        // Autoboxing: int to Integer
        int a = 10;
        Integer obj = a;

        System.out.println("Wrapper object: " + obj);

        // Unboxing: Integer to int
        Integer anotherObj = 20;
        int b = anotherObj;

        System.out.println("Primitive value: " + b);

        // Arithmetic with a wrapper object
        Integer x = 30;
        int result = x + 10;

        System.out.println("Result: " + result);
    }
}