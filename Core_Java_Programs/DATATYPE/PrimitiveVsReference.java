class Student {
    int age;
}

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // Primitive example
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("Primitive a: " + a);
        System.out.println("Primitive b: " + b);

        // Reference example
        Student std1 = new Student();
        std1.age = 10;

        Student std2 = std1;
        std2.age = 20;

        System.out.println("Reference std1: " + std1.age);
        System.out.println("Reference std2: " + std2.age);
    }
}