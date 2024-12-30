import java.util.Scanner;

class thirtythree {
    private static double amount;
    private static double rate;
    private static double period;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter the amount: ");
            amount = s.nextDouble();
            System.out.println("Enter the rate: ");
            rate = s.nextDouble();
            System.out.println("Enter the period: ");
            period = s.nextDouble();
            double first = (1+(rate/100));
            
            double ci =  Math.pow(first, period);
            System.out.println(amount*ci);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            s.close();
        }
    }
}
