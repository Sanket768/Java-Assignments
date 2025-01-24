/* 32 */
package chapter3;

public class range{
 public static void main(String[] args) {
    int start = 1; 
    int end = 50;
    for (int i = start; i <= end; i++) {
        if (i % 7 == 0) {
            System.out.println("First number divisible by 7: " + i);
            break;
        }
    }
} 
    
}

