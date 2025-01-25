/*
 * Create a Product base class with subclasses Electronics, Clothing, and Grocery. 
Implement polymorphism to calculate shipping charges.
 */
abstract class Product{
    abstract void calculateShipping();
}
class Electronics extends Product{
    @Override
    void calculateShipping(){
        System.out.println("Shipping charges for electronics: $10");
    }
}
class Clothing extends Product{
    @Override
    void calculateShipping(){
        System.out.println("Shipping charges for clothing: $5");
    }
}
class Grocery extends Product{
    @Override
    void calculateShipping(){
        System.out.println("Shipping charges for grocery: $2");
    }
}
public class twentyfive {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics();
        products[1] = new Clothing();
        products[2] = new Grocery();
        for(Product p: products){
            p.calculateShipping();
        }
    }
}
