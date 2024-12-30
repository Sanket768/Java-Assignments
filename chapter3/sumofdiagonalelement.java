/* 45 */
package chapter3;
import java.util.Scanner;
public class sumofdiagonalelement {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the square matrix (n): ");
    int n = scanner.nextInt();

    int[][] matrix = new int[n][n];
    System.out.println("Enter the elements of the matrix:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = scanner.nextInt();
        }
    }

    System.out.println("Matrix:");
    int diagonalSum = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[i][j] + " ");
            if (i == j) {
                diagonalSum += matrix[i][j];
            }
        }
        System.out.println();
    }

    System.out.println("Sum of diagonal elements: " + diagonalSum);
    scanner.close();
}
}
