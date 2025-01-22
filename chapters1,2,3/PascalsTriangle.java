
import java.util.*;
public class PascalsTriangle {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows for Pascal's triangle");
		int rows=scanner.nextInt();
		for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int value = 1; // Initialize the first value of each row
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                // Update the value based on the binomial coefficient formula
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
	}
}
