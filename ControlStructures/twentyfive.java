
/* Simulate a guessing game where the user has to guess a predefined number */
import java.util.*;

class GuessingGame {
    private int numberToGuess;

    public GuessingGame() {
        // Initialize the number to be guessed
        numberToGuess = (int) (Math.random() * 100);
    }

    public void startGame() {
        // Start the game by asking the user to guess the number
        System.out.println("Guess a number between 1 and 100");
        try (Scanner sc = new Scanner(System.in)) {
            int userGuess = sc.nextInt();
            // Check if the user's guess is correct
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number correctly!");
            } else {
                System.out.println("Sorry, your guess was incorrect. Try again!");
            }
        }
    }

}

public class twentyfive {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.startGame();
    }
}
