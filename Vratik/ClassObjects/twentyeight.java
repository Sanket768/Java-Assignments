/*
 * Create a class FileWriterDemo to write object details to a file.
 */

import java.io.FileWriter;

class Pd {
    private String name;
    private int product_quantity;
    private double unit_price;

    public Pd(String name, int product_quantity, double unit_price) {
        this.name = name;
        this.product_quantity = product_quantity;
        this.unit_price = unit_price;
    }

    public String getName() {
        return name;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public double calTotalCost() {
        return product_quantity * unit_price;
    }
}

class FileWriterDemo{
    public void writeProductToFile(Product product, String filename){
        try(FileWriter wr = new FileWriter(filename, true)) {
            wr.write("Product Name: " + product.getName() + "\n");
            wr.write("Quantity: " + product.getProduct_quantity() + "\n");
            wr.write("Unit Price: " + product.getUnit_price() + "\n");
            wr.write("Total Cost: " + product.calTotalCost() + "\n");
            wr.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class twentyeight {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 10, 10000);
        Product product2 = new Product("Lamborghini", 5, 10000000);

        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        fileWriterDemo.writeProductToFile(product1, "products.txt");
        fileWriterDemo.writeProductToFile(product2, "products.txt");
    }
}
