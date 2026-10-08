public class IfElseDemo2 {
    public static void main(String[] args) {
        double balance = 10000;
        double amount = 3000;
        boolean cardValid = true;

        if (cardValid) {
            if (amount > 0) {
                if (balance >= amount) {
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Insufficient balance");
                }
            } else {
                System.out.println("Invalid withdrawal amount");
            }
        } else {
            System.out.println("Invalid card");
        }
    }
}
