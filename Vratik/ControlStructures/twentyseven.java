
/* Print a diamond pattern using numbers or stars. */
import java.util.Scanner;

public class twentyseven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++)
                    System.out.print(" ");
                for (int k = 0; k <= i; k++)
                    System.out.print("* ");
                System.out.println();
            }
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j < n - i - 1; j++)
                    System.out.print(" ");
                for (int k = 0; k <= i; k++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}
