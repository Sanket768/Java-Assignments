// Program to perform Bitwise And, Or, XOR operations along with Left and Right shift

public class BitwiseOperations {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 7;

        System.out.println("The bitwise And of " + a + " and " + b + " is: " + (a&b));

        System.out.println("The bitwise Or of " + a + " and " + b + " is: " + (a|b));

        System.out.println("The bitwise XoR of " + a + " and " + b + " is: " + (a^b));
        
        System.out.println("The bitwise Not of " + a + " is: " + ~a);

        System.out.println("The left shift of " + a + " by 3 is: " + (a<<2));

        System.out.println("The right shift of " + a + " by 3 is: " + (a>>2));
    }    
}
