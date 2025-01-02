/* Convert temperature from Celsius to Fahrenheit. */
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter temperature in Celsius:");
            celsius = sc.nextFloat();
            fahrenheit = (celsius * 9/5 + 32);
            System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit. ");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
}