/*35 */
package chapter3;

public class countlimit {
    public static void main(String[] args) {
        int limit = 15; 
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
            if (i ==15) { 
                System.out.println("Exiting early at i = " + i);
                break;
            }
        }
    }
}
