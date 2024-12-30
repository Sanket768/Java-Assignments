/* Calculate the power of a number using a do-while loop. */
import java.util.*;
class Power {
    private int num;
    private int power;

    public Power(int num, int power) {
        this.num = num;
        this.power = power;
    }

    public double calculatePower() {
        double result = 1;
        do {
            result *= num;
            power--;
        } while (power > 0);
        return result;
    }

}

public class twentythree {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            System.out.println("Enter a power:");
            int power = sc.nextInt();
            Power p = new Power(num, power);
            System.out.println("The result is: " + p.calculatePower());
        }

    }
}
