// Program to check whether a char is upper or lower.

import java.util.Scanner;

public class CheckUpperOrLower {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch = (sc.next().charAt(0));

        if(Character.isUpperCase(ch)){
            System.out.println("The char " + ch + " is uppercase.");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("The char " + ch + " is lowercase.");
        }
        else{
            System.out.println("The char " + ch + " is neither uppercase or lowercase.");
        }
    }
}
