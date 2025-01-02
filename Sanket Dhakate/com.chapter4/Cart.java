/* Create a Cart class that contains a list of Product objects. Add methods to calculate the total cost. */
import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Cart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("Laptop", 800));
        cart.addProduct(new Product("Mouse", 20));

        System.out.println("Total Cost: " + cart.calculateTotal());
    }
}
