public class UnaryDemo {
    public static void main(String[] args) {
        int a = 10;
        boolean isActive = true;

        System.out.println(+a);
        System.out.println(-a);
        System.out.println(!isActive);
        System.out.println(~a);
    }
}

// Why is ~10 equal to -11? The ~ operator flips every bit of the integer. For an int, the result follows the two's-complement identity ~x == -x - 1.