/* 50 */
package chapter3;
import java.util.Scanner;
public class hanoi {
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveHanoi(n - 1, source, destination, auxiliary); 
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, auxiliary, source, destination); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        System.out.println("Steps to solve the Tower of Hanoi:");
        
        solveHanoi(n, 'A', 'B', 'C'); 
        scanner.close();
    }
}
