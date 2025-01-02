/*
 * Demonstrate the difference between pre-increment and post-increment operators.
 */
public class fortyone {
    public static void main(String[] args) {
        int x = 5;
        
        for(int i = 0; i<=x; i++){
            System.out.println("Pre-increment: " + (++i));
        }

        for(int i = 0; i<=x; i++){
            System.out.println("Post-increment: " + (i++));
            }

    }
}