/* 22 */
package chapter3;
import java.util.Random;

public class randomnumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number;

        do {
            number = random.nextInt(100) + 1; 
            System.out.println("Generated number: " + number);
        } while (number % 7 != 0);

        System.out.println("Found a number divisible by 7: " + number);
    }
}
