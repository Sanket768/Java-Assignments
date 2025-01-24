/* check if the is divisible by both 3 and 5  */
package chapter2;
import java.util.Scanner;
public class Divisible {
    public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter the number :");
         int number = scanner.nextInt();
         if(number % 3 == 0 && number % 5 == 0){
            System.out.println(number+ " is divisible by both 3 and 5 ");
         }else{
            System.out.println(number + " is not divisible by both 3 and 5 ");
         }

    }
}
