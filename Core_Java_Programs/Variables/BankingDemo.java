class BankAccount {
    // Instance variables: each account has its own values
    String name;
    double balance;
    // Static variable: shared by all accounts
    static String bankName = "HDFC Bank";

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        // Local variable
        double updatedBalance = balance + amount;
        balance = updatedBalance;
    }

    void display() {
        System.out.println("Bank: " + BankAccount.bankName);
        System.out.println("Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankingDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul", 5000);
        BankAccount acc2 = new BankAccount("Priya", 8000);

        acc1.deposit(1000);

        acc1.display();
        System.out.println();
        acc2.display();
    }
}
