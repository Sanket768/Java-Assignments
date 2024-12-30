/* check if a given number lies within a specific range */

package chapter2;
import java.util.Scanner;

public class SpicificRange {
    public static void  main (String[]args){
        Scanner scanner= new Scanner(System.in);
        int lowerbound = 10;
        int upperbound = 50;
        System.out.println("enter the number:"); 
        int number = scanner.nextInt();
        if ( number >= lowerbound && number <= upperbound){
            System.out.println(number + " is within the range " + lowerbound + " to "+ upperbound);
        }else{
            System.out.println(number + " is out of range " + lowerbound + "to" + upperbound);
        }
        scanner.close();
        }
}
