/* Create a Product class with attributes like name, price, and stock. Add methods to handle stock updates. */
class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void updateStock(int quantity) {
        stock += quantity;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 800, 10);
        product.updateStock(5);
        product.displayDetails();
    }
}
