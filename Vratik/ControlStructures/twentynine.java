
/* Write a program to display Pascal’s Triangle. */
import java.util.*;

public class twentynine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter the number of rows:");
            int n = sc.nextInt();
            int[][] arr = new int[n][n]; // Create a 2D array
            for (int i = 0; i < n; i++) // Loop through each row
            {
                for (int j = 0; j <= i; j++)
                {
                    if (j == 0 || j == i) // If it's the first or last element in the row
                        arr[i][j] = 1; // Set it to 1
                    else
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]; // Otherwise, add the two numbers above it
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[i][j] + " "); // Print the numbers in the triangle
                }
                System.out.println();
            }
        }
        finally{
            sc.close();
        }
    }
}
