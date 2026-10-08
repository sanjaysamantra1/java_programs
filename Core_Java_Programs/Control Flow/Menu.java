import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Say Hello");
            System.out.println("2. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}