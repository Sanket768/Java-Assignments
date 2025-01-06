/* determine if a person is eligible for voting and driving based on their age */
package chapter2;
import java.util.Scanner;
public class VotingAndDriving {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System. out.println("enter the age:");
        int age = scanner.nextInt();
        if ( age>=18){
            System.out.println("you are eligible for voting and driving");
        }else{
            System . out .println(" you are not eligible for voting and driving ");
        }
    }
}
