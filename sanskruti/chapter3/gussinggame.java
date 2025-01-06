/* 25 */
package chapter3;
import java.util.Scanner;
public class gussinggame {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            final int target = 42; 
            int guess;
    
            System.out.println("Guess the number (between 1 and 100):");
    
            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
    
                if (guess < target) {
                    System.out.println("Too low!");
                } else if (guess > target) {
                    System.out.println("Too high! ");
                } else {
                    System.out.println("Congrats");
                }
            } while (guess != target);
    
            sc.close();
}
}
