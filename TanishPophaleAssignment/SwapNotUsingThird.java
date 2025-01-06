// Swap two numbers without using third variable/number

public class SwapNotUsingThird {
    
    public static void main(String[] args){
        int a = 15;
        int b = 20;

        System.out.println("The values of a and b are: " + a + " " + b);

        // Swap two numbers without using third variable/number
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("THe values of a and b after swapping is: " + a + " " + b);
    }
}
