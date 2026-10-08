
class Employee {

    // Instance variables
    String name;
    double monthlySalary;

    // Static variable
    static String companyName = "Tech Solutions";

    Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    void calculateBonus() {

        // Local variable
        double bonus = monthlySalary * 0.10;

        System.out.println("Employee: " + name);
        System.out.println("Company: " + companyName);
        System.out.println("Annual Bonus: " + bonus);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Rahul", 50000);
        Employee emp2 = new Employee("Priya", 60000);

        emp1.calculateBonus();
        System.out.println();
        emp2.calculateBonus();
    }
}
