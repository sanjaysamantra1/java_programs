// var must have an initial value
public class VarTest2 {
    public static void main(String[] args) {
        // var age;       // Compilation error
        // var value = null; // Compilation error

        var age = 25;
        System.out.println(age);
    }
}