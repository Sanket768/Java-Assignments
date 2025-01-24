/*
 * Create a Product class with attributes like name, price, and stock. Add methods to handle stock updates.
 */
class Product{
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Method to update stock
    public void updateStock(int stock){
        this.stock += stock;
    }

    public void display(){
        System.out.println("Product: "+name);
        System.out.println("Price: "+price);
        System.out.println("Stock: "+stock);
    }
}


public class twentyfive {
    public static void main(String[] args){
        Product p = new Product("Laptop", 50000, 10);
        System.out.println("Before Stock Update: ");
        p.display();
        System.out.println("After Stock Update: ");
        p.updateStock(5);
        p.display();
    }

}
