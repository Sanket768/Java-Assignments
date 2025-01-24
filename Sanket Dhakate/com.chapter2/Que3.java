/* Write a program to compute the power of a number
   using the Math.pow() and the * operator. */
import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number & power : ");
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println(Math.pow(number, power));
        
        int total=1;
        
        for (int  i = 1; i <= power; i++){
            total = total * number;
        }
        System.out.println(total);
    }
}
