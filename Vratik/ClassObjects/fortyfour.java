/*
 * Use the Stream API to process a list of Product objects (e.g., filter, map, and reduce).
 */
import java.util.*;
import java.util.stream.*;

class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
public class fortyfour {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 100));
        products.add(new Product("Product2", 200));
        products.add(new Product("Product3", 150));

        List<Product> filteredProducts = products.stream().filter(p -> p.getPrice() > 100).collect(Collectors.toList());

        List<String> productNames = products.stream().map(Product::getName).collect(Collectors.toList());

        double totalPrice = products.stream().map(Product::getPrice).reduce(0.0, Double::sum);

        System.out.println("Filtered Products: ");
        filteredProducts.forEach(p -> System.out.println(p.getName() + ": " + p.getPrice()));

        System.out.println("Product Names: ");
        productNames.forEach(System.out::println);

        System.out.println("Total Price: " + totalPrice);

    }
}
