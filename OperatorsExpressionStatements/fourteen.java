
/*
 * Validate user input using logical conditions (e.g., age > 0 and age < 150).
 */
import java.util.*;

public class fourteen {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = s.nextInt();
            if (age > 0 && age < 150) {
                System.out.println("You are age is between 0 to 150");
            } else {
                System.out.println("Invalid age!!");
            }
        }
    }
}
