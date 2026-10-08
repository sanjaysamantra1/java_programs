public class IntegerParsingDemo {
    public static void main(String[] args) {
        String input = "250";

        int number = Integer.parseInt(input);

        System.out.println("Input: " + input);
        System.out.println("Number: " + number);
        System.out.println("After addition: " + (number + 50));
    }
}