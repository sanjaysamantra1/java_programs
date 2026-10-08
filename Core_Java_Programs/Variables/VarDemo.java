public class VarDemo {
    public static void main(String[] args) {
        int age = 25;
        String name = "Rahul";
        double salary = 45000.50;

        // Using var
        var number = 100;
        var employeeName = "Rahul";
        var employeeSalary = 45000.50;

        System.out.println(number);
        System.out.println(employeeName);
        System.out.println(employeeSalary);
    }
}