/* Generate a random number until a specific condition (e.g., divisible by 7) is met. */
public class Question22 {
    public static void main(String[] args) {
        int number;

        do {
            number = (int) (Math.random() * 100); 
            System.out.println("Generated number: " + number);
        } while (number % 7 != 0); 

        System.out.println("Number divisible by 7: " + number);
    }
}
