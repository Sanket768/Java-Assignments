// Program to find a number is present in the given range

import java.util.Scanner;

public class NumberWithinRange {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to find: ");
        int num = sc.nextInt();

        System.out.println("Enter the start range number: ");
        int startRange = sc.nextInt();

        System.out.println("Enter the end range number: ");
        int endRange = sc.nextInt();


        if(num>=startRange && num<=endRange){
            System.out.println("The " + num + " is within the given range.");
        }
        else{
            System.out.println("The " + num + " is not within the given range.");
        }

    }
}
