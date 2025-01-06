import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Check if the input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + n + " terms:");

            // Variables to store the first two terms of the Fibonacci series
            int first = 0, second = 1;

            // Print the Fibonacci series
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }

        // Close the scanner
        scanner.close();
    }
}

