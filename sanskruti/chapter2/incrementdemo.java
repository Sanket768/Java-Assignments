/* Demonstrate the difference between pre-increment and post-increment operators  */
package chapter2;

public class incrementdemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        
        int preIncrement = ++a; 
        System.out.println("Pre-increment: a = " + a + ", preIncrement = " + preIncrement);

        
        int postIncrement = b++; 
        System.out.println("Post-increment: b = " + b + ", postIncrement = " + postIncrement);
    }
}
