import java.util.Arrays;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class ShallowCopyDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John"),
                new Student("Alice")
        };

        Student[] copy = students.clone();

        copy[0].name = "Bob";

        System.out.println(students[0].name);
        System.out.println(copy[0].name);
    }
}