/* Simulate a guessing game where the user has to guess a predefined number */
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 42;
        int userGuess;

        do {
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();

            if (userGuess < number) {
                System.out.println("Too low");
            } else if (userGuess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("You guessed the correct number.");
            }
        } while (userGuess != number);
    }
}
