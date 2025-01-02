/* Implement a number guessing game with limited attempts. */
import java.util.Scanner;

public class Question40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 42; 
        int attempts = 5;
        int userGuess;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("You have " + attempts + " attempts to guess the number.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Guess the number: ");
            userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (i == attempts) {
                System.out.println("Game over! The secret number was: " + secretNumber);
            }
        }
    }
}
