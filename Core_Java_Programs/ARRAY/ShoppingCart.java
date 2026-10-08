class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    static double calculateTotal(Product... products) {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }

    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 50000);
        Product mouse = new Product("Mouse", 1000);
        Product keyboard = new Product("Keyboard", 2000);

        double total = calculateTotal(laptop, mouse, keyboard);
        System.out.println("Total = ₹" + total);
    }
}