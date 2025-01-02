/* Use a loop to display numbers from 1 to 10 but skip the number 5 using continue. */
public class Question31 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; 
            }
            System.out.println(i);
        }
    }
}
