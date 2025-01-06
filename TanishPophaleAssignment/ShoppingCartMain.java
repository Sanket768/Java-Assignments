// Create a Cart class that contains a list of Product objects. Add methods to calculate the total cost.

import java.util.*;

class Product{
    public int productId;
    public String name;
    public float cost;

    public Product(int productId, String name, float cost) {
        this.productId = productId;
        this.name = name;
        this.cost = cost;
    }

    
}

class ShoppingCart{

    

    public double totalproductCost(ArrayList<Product> products){

        double totalCost = products.stream()
                                .map(product -> product.cost)
                                .reduce(0.00f, (sum , cost) -> sum+cost);
                            
        return totalCost;

    }
}

public class ShoppingCartMain {
    
    public static void main(String[] args) {
        
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Soap", 125));
        products.add(new Product(2, "Perfume", 230));
        products.add(new Product(3, "Bottle", 200));
        

        ShoppingCart s = new ShoppingCart();
        System.out.println("The cost of total products is: " + s.totalproductCost(products));

        
    }
}
