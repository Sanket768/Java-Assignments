/* Compare two floating-point numbers and 
   display which one is larger. */
public class Que8 {
    public static void main(String[] args) {
        float num1 = 30.5f;
        float num2 = 40.5f;
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal");
        } else {
            System.out.println("Invalid number");
        }
    }
}
