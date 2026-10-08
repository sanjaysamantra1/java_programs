
class Employee {
    // Instance fields
    String name;
    int age;
    double salary;
    boolean isPermanent;
    char grade;

    // Static field
    static int employeeCount;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Grade: " + (int) grade);
        System.out.println("Employee Count: " + employeeCount);
    }
}

public class DefaultFieldDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.display();
    }
}
