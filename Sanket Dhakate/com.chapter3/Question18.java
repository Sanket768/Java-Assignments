/* Count the number of digits in an integer. */
public class Question18 {
    public static void main(String[] args) {
        int num = 12345; 
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}