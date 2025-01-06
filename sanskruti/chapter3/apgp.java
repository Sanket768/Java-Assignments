/*39 */
package chapter3;
import java.util.Scanner;
public class apgp {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first term (a): ");
    int a = scanner.nextInt();
    System.out.print("Enter the common difference (d) for AP: ");
    int d = scanner.nextInt();
    System.out.print("Enter the common ratio (r) for GP: ");
    int r = scanner.nextInt();
    System.out.print("Enter the number of terms (n): ");
    int n = scanner.nextInt();

    System.out.println("Arithmetic Progression:");
    for (int i = 0; i < n; i++) {
        System.out.print(a + i * d + " ");
    }
    System.out.println();

    System.out.println("Geometric Progression:");
    for (int i = 0; i < n; i++) {
        System.out.print(a * Math.pow(r, i) + " ");
    }
    System.out.println();

    scanner.close();
}
}
