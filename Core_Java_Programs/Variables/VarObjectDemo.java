class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class VarObjectDemo {
    public static void main(String[] args) {
        var std1 = new Student("Rahul");

        System.out.println(std1.name);
    }
}