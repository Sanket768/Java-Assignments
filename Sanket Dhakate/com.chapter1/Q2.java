/*Swap two numbers using a third variable. */

public class Q2 {
    public static void main(String[] args){

        int a = 30;
        int b = 40;
        int temp;

        System.out.println("Intial Value : a = " + a + " b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping : a = " + a + " b = " + b);

    }
    
}
