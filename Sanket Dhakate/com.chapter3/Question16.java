/* Find the reverse of a number using a while loop. */
public class Question16 {
    public static void main(String[] args) {
        int num = 12345; 
        int reverse = 0;
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse of the number: " + reverse);
    }
}