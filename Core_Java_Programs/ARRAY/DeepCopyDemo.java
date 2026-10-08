public class DeepCopyDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John"),
                new Student("Alice")
        };
        Student[] copy = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            copy[i] = new Student(students[i].name);
        }
        copy[0].name = "Bob";

        System.out.println(students[0].name);
        System.out.println(copy[0].name);
    }
}