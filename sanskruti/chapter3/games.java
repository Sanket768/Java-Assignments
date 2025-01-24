/* 40 */
package chapter3;
import java.util.Scanner;
import java.util.Random;
public class games {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 5; 
        boolean guessed = false;

        System.out.println("Guess the number between 1 and 100. You have " + attempts + " attempts.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number.");
                guessed = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!guessed) {
            System.out.println("Sorry, you've used all attempts. The number was: " + numberToGuess);
        }

        scanner.close();
    }
}
