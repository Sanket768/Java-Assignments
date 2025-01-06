// swapping of Two Numbers using third variable

public class SwapTwoVariables {
    
    public static void main(String[] args){
        int a = 15;
        int b = 20;

        System.out.println("The value of a and b are: " + a + " " + b);

        // swapping of Two Numbers using third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The values of a and b after swapping is: " + a + " " + b);

    }
}
