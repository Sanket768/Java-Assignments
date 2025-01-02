/* 3. Write a program to compute the power of a number using Math.pow() and
the * operator. */
import java.util.*;
public class third {
    public static void main(String[] args) {
        float base, exponent, result;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the base number:");
            base = sc.nextFloat();
            System.out.println("Enter the exponent:");
            exponent = sc.nextFloat();
            result = (float) Math.pow(base, exponent);
            System.out.println("The power of the number is: " + result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
