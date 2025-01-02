/* Write a program to display a matrix of numbers and calculate the sum of its diagonal elements. */
import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int sum = 0;

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}
