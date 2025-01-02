/* Check if a number is a palindrome. */
public class Question17 {
    public static void main(String[] args) {
        int num = 121; 
        int original = num;
        int reverse = 0;
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
