/* Find the largest of three numbers using nested if-else. */
public class Question2 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 10;

        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest number");
            }
        else if(b > a) {
                if (b > c) {
                    System.out.println("b is the largest number");
                } 
            } else {
                System.out.println("c is the largest number");
            }
        }
    }
}
