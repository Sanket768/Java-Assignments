/*
 * Create a Cart class that contains a list of Product objects. Add methods to calculate the total cost.
 * => Cart: 
 *      A product = x quantity => unit_price = y Rs; => Total Cost: x * y Rs
 *      B product = y quantity => unit_price = z Rs; => Total Cost: y * Z Rs
 *      Total Cost:
 *          Total Cost A + Total Cost B;
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.calTotalCost();
        }
        return totalCost;
    }
}

class Product {
    private String name;
    private int product_quantity;
    private double unit_price;

    public Product(String name, int product_quantity, double unit_price) {
        this.name = name;
        this.product_quantity = product_quantity;
        this.unit_price = unit_price;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the product_quantity
     */
    public int getProduct_quantity() {
        return product_quantity;
    }

    /**
     * @param product_quantity the product_quantity to set
     */
    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    /**
     * @return double return the unit_price
     */
    public double getUnit_price() {
        return unit_price;
    }

    /**
     * @param unit_price the unit_price to set
     */
    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double calTotalCost() {
        return product_quantity * unit_price;
    }

}

public class twentyseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of first product: ");
        String productName1 = sc.nextLine();
        System.out.println("Enter the quantity of the product: ");
        int quantity1 = sc.nextInt();
        System.out.println("Enter the unit price of the first product: ");
        double price1 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter the name of second product: ");
        String productName2 = sc.nextLine();
        System.out.println("Enter the quantity of second product: ");
        int quantity2 = sc.nextInt();
        System.out.println("Enter the unit price of the second product: ");
        double price2 = sc.nextDouble();


        Product product1 = new Product(productName1, quantity1, price1);
        Product product2 = new Product(productName2, quantity2, price2);

        product1.calTotalCost();
        product2.calTotalCost();

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("Total cost of the cart is: "+ cart.calculateTotalCost());
        sc.close();

    }
}
