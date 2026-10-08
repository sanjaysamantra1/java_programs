
public class TypeCastingDemo {
    public static void main(String[] args) {
        // 1. Implicit Typecasting (Widening)
        int num = 65;
        double result = num;

        char my_char = 65; 		//ASCII value for 65 is 'A'
        
        System.out.println("Implicit Typecasting:");
        System.out.println("int value: " + num);
        System.out.println("double value: " + result);
		System.out.println(my_char);  // Implicit typecasting

        // 2. Explicit Typecasting (Narrowing)
        double price = 99.99;
        int convertedPrice = (int) price;

        System.out.println("\nExplicit Typecasting:");
        System.out.println("double value: " + price);
        System.out.println("int value: " + convertedPrice);
    }
}
/*typecasting = converting value of one datatype to another datatype

1. implicit (Automatic/widening) (storing a lower value in higher datatype variable)
2. Explicit (Manual/narrowing);  (storing a higher value in a lower datatype variable)

*/


