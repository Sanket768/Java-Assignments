/* Print all numbers from 1 to 50, skipping numbers divisible by both 3 and 5. */
public class thirtyfour {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
