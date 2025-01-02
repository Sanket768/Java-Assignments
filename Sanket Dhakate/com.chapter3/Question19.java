/* Calculate the sum of digits of a number. */
public class Question19 {
    public static void main(String[] args) {
        int num = 12345; 
        int sum = 0;
        int remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            sum = sum + remainder;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}