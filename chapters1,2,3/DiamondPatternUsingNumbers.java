
import java.util.*;
public class DiamondPatternUsingNumbers {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows of half diamond");
		int rows=scanner.nextInt();
		// Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print descending numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print descending numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            // Move to the next line
            System.out.println();
        }
	}
}
