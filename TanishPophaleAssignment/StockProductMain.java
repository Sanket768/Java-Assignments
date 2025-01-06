// Create a Product class with attributes like name, price, and stock. Add methods to handle stock updates. 

// Little incorrect output please check.

class StockProduct{
    public String name;
    public double price;
    public int stockNo;

    StockProduct(String name, double price){
        this.name = name;
        this.price = price;
        this.stockNo = 1;
    }

    public void addStock(int increaseNoOfStocks){
        this.stockNo += increaseNoOfStocks;
        price += (price * increaseNoOfStocks);
        System.out.println("No of Stocks Added: " + increaseNoOfStocks
        );
        System.out.println("");
    }

    public void totalNoOfStocks(){
        System.out.println("The total no of stocks is: " + this.stockNo);
        System.out.println("");
    }

    public void decreaseStock(int decreaseNoOfStocks){
        if(this.stockNo>=decreaseNoOfStocks){
            this.stockNo -= decreaseNoOfStocks;
            price -= (price*decreaseNoOfStocks);
            System.out.println("No of Stocks decrease: " + decreaseNoOfStocks);
            System.out.println("");
        }
        else{
            System.out.println("Less Stocks are available.");
        }
    }

    public void displayStockDetails(){
        System.out.println("The stock details are: ");
        System.out.println("Stock Name: " + this.name);
        System.out.println("Stock Price: " + this.price);
        System.out.println("No of Stocks: " + this.stockNo);
        System.out.println("");
    }

    public void totalPrice(){
        System.out.println("Total stock price: " + this.price);
    }
}

public class StockProductMain {
    
    public static void main(String[] args) {
        StockProduct s = new StockProduct("HCL", 2000);

        s.totalPrice();
        s.addStock(3);
        s.totalPrice();
        s.totalNoOfStocks();
        s.decreaseStock(2);
        s.totalPrice();
        s.totalNoOfStocks();
        s.displayStockDetails();

    }


}
