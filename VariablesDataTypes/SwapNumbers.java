
/*Swap two numbers using a third variable */
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1, num2, temp;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number1: ");
            num1 = sc.nextInt();
            System.out.println("Enter number2: ");
            num2 = sc.nextInt();
            temp = num2;
            num2 = num1;
            num1 = temp;
            System.out.println("Number1 after swapping: " + num1);
            System.out.println("Number2 after swapping: " + num2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}