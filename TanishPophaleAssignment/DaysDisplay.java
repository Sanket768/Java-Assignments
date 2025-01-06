// Program to find the day of the week based on the given number.

import java.util.Scanner;

public class DaysDisplay {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for the day of the week you want: ");
        short num = sc.nextShort();

        switch (num) {
            case 1:
                System.out.println("It is Sunday");
                break;

            case 2:
                System.out.println("It is Monday");
                break;

            case 3:
                System.out.println("It is Tuesday.");
                break;
        
            case 4:
                System.out.println("It is Wednesday.");
                break;

            case 5:
                System.out.println("It is Thrusday.");
                break;
        
            case 6:
                System.out.println("It is Friday");
                break;
        
            case 7:
                System.out.println("It is Satrday");
                break;
        
        
            default:
                System.out.println("Invalid number.");
                break;
        }



    }
}
