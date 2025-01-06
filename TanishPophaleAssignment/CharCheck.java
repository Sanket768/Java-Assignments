// Program to check whether a character is vowel, consonant or neither (like digits)

import java.util.Scanner;

public class CharCheck {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch = (sc.next().charAt(0));
        char ch2 = Character.toUpperCase(ch);

        if(ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U'){
            System.out.println("The character " + ch2 + " is a vowel.");
        }
        else if(ch2>=67 && ch2<=90){
            System.out.println("The character " + ch2 + " is a character.");
        }
        else{
            System.out.println("THe character " + ch2 + " is not an alphabet." );
        }

    }
}
