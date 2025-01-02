/* Perform bitwise AND, OR, XOR, 
   left shift, and right shift operations on two integers. */
public class Que16 {
    public static void main(String[] args) {
        int a = 5; 
        int b = 3; 
        System.out.println("Bitwise AND: " + (a & b)); 
        System.out.println("Bitwise OR: " + (a | b)); 
        System.out.println("Bitwise XOR: " + (a ^ b)); 
        System.out.println("Left Shift on a: " + (a << 1));
        System.out.println("Left Shift on b: " + (b << 1)); 
        System.out.println("Right Shift: " + (a >> 1)); 
        System.out.println("Right Shift: " + (b >> 1));
    }
}
