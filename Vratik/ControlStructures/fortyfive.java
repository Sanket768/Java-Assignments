
/* 45. Write a program to display a matrix of numbers and calculate the sum of its diagonal
elements. */
import java.util.Scanner;

public class fortyfive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        // Initialize matrix
        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The entered matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate the sum of diagonal elements
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i]; // Primary diagonal
            secondaryDiagonalSum += matrix[i][n - i - 1]; // Secondary diagonal
        }

        // Display the results
        System.out.println("Sum of primary diagonal elements: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal elements: " + secondaryDiagonalSum);
        System.out.println("Total sum of diagonal elements: " + (primaryDiagonalSum + secondaryDiagonalSum));

        scanner.close();
    }
}
