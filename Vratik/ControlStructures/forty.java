
/* Implement a number guessing game with limited attempts. */
import java.util.*;

public class forty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            int num = (int) (Math.random() * 100) + 1;
            int count = 0;
            while (count < 5) {
                System.out.println("Guess a number between 1 and 100");
                int guess = sc.nextInt();
                if (guess == num) {
                    System.out.println("You guessed it!");
                    break;
                } else if (guess < num) {
                    System.out.println("Too low!");
                    count++;
                } else {
                    System.out.println("Too high!");
                    count++;
                }
            }
        }
    }
}
