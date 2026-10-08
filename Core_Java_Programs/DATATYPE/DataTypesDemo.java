
public class DataTypesDemo {
    public static void main(String[] args) {
        // 1. BYTE: 8-bit integer
        byte byteValue = 100;
        System.out.println("byte value: " + byteValue);

        // 2. SHORT: 16-bit integer
        short shortValue = 30000;
        System.out.println("short value: " + shortValue);

        // 3. INT: 32-bit integer
        int intValue = 100000;
        System.out.println("int value: " + intValue);

        // 4. LONG: 64-bit integer
        long longValue = 9000000000L;
        System.out.println("long value: " + longValue);

        // 5. FLOAT: 32-bit floating-point number
        float floatValue = 12.5F;
        System.out.println("float value: " + floatValue);

        // 6. DOUBLE: 64-bit floating-point number
        double doubleValue = 12345.6789;
        System.out.println("double value: " + doubleValue);

        // 7. CHAR: single UTF-16 code unit
        char charValue = 'A';
        System.out.println("char value: " + charValue);

        // 8. BOOLEAN: true or false
        boolean booleanValue = true;
        System.out.println("boolean value: " + booleanValue);

        // 9. STRING: reference type
        String stringValue = "Hello Java";
        System.out.println("String value: " + stringValue);

        // 10. ARRAY: reference type
        int[] numbers = { 10, 20, 30 };
        System.out.println("Array first element: " + numbers[0]);

        // 11. CLASS OBJECT: reference type
        Student student = new Student("Rahul", 25);
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);

        // 12. ENUM: reference type
        Day today = Day.MONDAY;
        System.out.println("Enum value: " + today);
    }

    // Custom class
    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Custom enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }
}
