public class FinalConstantDemo {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int MAX_LOGIN_ATTEMPTS = 3;

        System.out.println("PI: " + PI);
        System.out.println("Maximum login attempts: " + MAX_LOGIN_ATTEMPTS);

        // PI = 3.14; // Compilation error
        // MAX_LOGIN_ATTEMPTS = 5; // Compilation error
    }
}