public class VarTest1 {
    public static void main(String[] args) {
        var number = 10; // Inferred as int

        number = 20;    // Valid

        // number = "Hello"; // Compilation error

        System.out.println(number);
    }
}