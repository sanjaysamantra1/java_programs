import java.util.ArrayList;

public class BoxingListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Unboxing
        int first = numbers.get(0);

        System.out.println("Numbers: " + numbers);
        System.out.println("First number: " + first);
        System.out.println("Sum: " +
                (numbers.get(0) + numbers.get(1) + numbers.get(2)));
    }
}