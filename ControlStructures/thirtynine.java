
/* Print the first n terms of an arithmetic progression and a geometric progression. */
import java.util.*;

public class thirtynine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Enter the first term of the arithmetic progression:");
            int a = sc.nextInt();
            System.out.println("Enter the common difference of the arithmetic progression:");
            int d = sc.nextInt();
            System.out.println("Enter the number of terms of the arithmetic progression:");
            int n = sc.nextInt();
            System.out.println("Enter the first term of the geometric progression:");
            int A = sc.nextInt();
            System.out.println("Enter the common ratio of the geometric progression:");
            int r = sc.nextInt();
            System.out.println("Enter the number of terms of the geometric progression:");
            int m = sc.nextInt();
            System.out.println("Arithmetic Progression: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a + (i * d) + " ");
            }
            System.out.println();
            System.out.println("Geometric Progression: ");
            for (int i = 0; i < m; i++) {
                System.out.print(A * (int) Math.pow(r, i) + " ");
            }
            System.out.println();
        }
    }
}
